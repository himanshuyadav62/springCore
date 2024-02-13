package com.springCore.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpEL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/SpEL/config.xml"); 
		
		Demo d = context.getBean("demo",Demo.class);
		System.out.println(d);	

		
	}

}
