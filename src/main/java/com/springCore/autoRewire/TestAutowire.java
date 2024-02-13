package com.springCore.autoRewire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowire {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =
		new ClassPathXmlApplicationContext("com/springCore/autoRewire/autoConfig.xml"); 
		
		Employee emp = context.getBean("emp1",Employee.class);
		System.out.println(emp);

	}

}
