package com.springCore.stereo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestStereo {

	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("com/springCore/stereo/configStereo.xml");
	
		Student student = (Student)context.getBean("s1",Student.class); 
		System.out.println(student.hashCode());
		Student student1 = (Student) context.getBean("s1",Student.class); 
		System.out.println(student1.hashCode());
	}
}
