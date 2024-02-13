package com.springCore.lifeCycle;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestLC {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/lifeCycle/configLC.xml"); 
		
		// implementing bean life cycle using xml files 
		Car c1 = (Car)context.getBean("car1"); 
		 System.out.println(c1);
		 
		 // registering shutdown hook 
		 context.registerShutdownHook(); 
		 
		 // implementing bean lifecycle using interfaces 
		 Aeroplane a1 = (Aeroplane)context.getBean("air1"); 
		 System.out.println(a1);
		 
		 // implementing bean life cycle using annotations 
		 Ship s1 = (Ship)context.getBean("ship1"); 
		 System.out.println(s1);

	}
}
