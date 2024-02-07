package com.springCore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext; 

public class TestCollectionBeans {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context =
		new ClassPathXmlApplicationContext("com/springCore/collections/collectionConfig.xml"); 
		Employee emp11 = (Employee) context.getBean("emp1"); 
		System.out.println(emp11);
	}
}
         