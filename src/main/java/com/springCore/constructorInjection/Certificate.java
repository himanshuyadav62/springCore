package com.springCore.constructorInjection;

public class Certificate {
	private String name;

	public Certificate(String name) {
		super();
		this.name = name;
	} 
	String getName() {
		return name; 
	}
}
