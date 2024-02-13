package com.springCore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCI {
	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("com/springCore/constructorInjection/configCI.xml"); 
		Person p = (Person)(context.getBean("p1")); 
		System.out.println(p);
		Addition a = (Addition)(context.getBean("add")); 
//		System.out.println(a);

	}
}
