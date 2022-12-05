package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		StudentService sts  = ctx.getBean("StuSer",StudentService.class);
		
		sts.printAppName();
		sts.printList();
		sts.printMap();
		
		//ClassPathXmlApplicationContext ctx2 = (ClassPathXmlApplicationContext) ctx;
		
		//ctx2.close();

	}

}
