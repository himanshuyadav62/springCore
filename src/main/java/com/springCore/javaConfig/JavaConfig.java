package com.springCore.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	@Bean(name ="getStudent")
	public Student getStudent() {
		Student st =  new Student(play()); 
		return st; 
	}
	
	@Bean
	public Play play() {
		return new Play(); 
	}

}
