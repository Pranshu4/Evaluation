package com.masai.service;

import java.util.List;

import com.masai.bean.Product;
import com.masai.exception.ProductException;
import com.masai.repo.ProductRepo;
import com.masai.repo.ProductRepoImpl;

public class ProductServiceImpl implements ProductService {
     ProductRepo pRepo = new ProductRepoImpl();
	@Override
	public boolean addProduct(Product product) {
		return pRepo.insertProductDetails(product);
	}

	@Override
	public List<Product> getAllProducts() {
		return pRepo.getAllProductDetails();
	}

	@Override
	public Product getProductById(int productId) throws ProductException {
		Product prod = pRepo.findProduct(productId);
		if(prod==null)
		{
			throw new ProductException("Product Not found");
		}
		return prod;
	}

	@Override
	public List<Product> getProductsBetweenPrice(int fromPrice, int toPrice) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

}
