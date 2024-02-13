package com.springCore.constructorInjection;

import java.util.List;

public class Person {
	private String personName; 
	private int personId; 
	Certificate cer; 
	List<String> li; 
	public Person(String n,int id,Certificate cer,List<String> li) {
		this.personId = id; 
		this.personName = n; 
		this.cer = cer; 
		this.li = li; 
	}

	@Override
	public String toString() {
		return "Person [personName=" + personName + ", personId=" + personId + " certificate " + cer.getName()+ "]" ;
	
	}
	
}
