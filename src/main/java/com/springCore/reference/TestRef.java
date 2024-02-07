package com.springCore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestRef {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/reference/refConfig.xml"); 
		
		A temp = (A) context.getBean("aref"); 
		System.out.println(temp);
		
		B temp1 = (B) context.getBean("bref"); 
		System.out.println(temp1);


	}

}
