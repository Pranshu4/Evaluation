package com.masai.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.masai.bean.Product;
import com.masai.utility.EMUtil;
@Repository
public class ProductRepoImpl implements ProductRepo {
	  EntityManager em = EMUtil.provideEntityManager(); 
	@Override
	public boolean insertProductDetails(Product product) {
		em.getTransaction().begin();
		em.persist(product);
		em.getTransaction().commit();
		em.close();
		
		return true;
	}

	@Override
	public List<Product> getAllProductDetails() {
		String jpql="from Product";
		
		Query q =	em.createQuery(jpql);
	    List  pDetails =q.getResultList();
		
	   return pDetails;
	}

	@Override
	public Product findProduct(int productId) {
		Product prod = em.find(Product.class, productId);
		return prod;
	}

	@Override
	public List<Product> getProductInPriceRange(int fromPrice, int toPrice) {
		// TODO Auto-generated method stub
		return null;
	}

}
