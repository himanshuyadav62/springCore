package com.springCore.standAlone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSAC {

	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("com/springCore/standAlone/collections/configSAC.xml"); 
		Person p = (Person)context.getBean("p1",Person.class); 
		System.out.println(p);
	}
}
