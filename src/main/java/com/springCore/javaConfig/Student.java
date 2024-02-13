package com.springCore.javaConfig;


public class Student {
	private Play p;  
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(Play p) {
		super();
		this.p = p;
	}


	public void study() {
		this.p.play();
		System.out.println("student is studying");

	}

}
