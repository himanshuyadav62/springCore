package com.springCore.lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Ship {
	private String name;

	public Ship() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Ship(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Ship [name=" + name + "]";
	} 
	@PostConstruct
	public void start(){
		System.out.println("starting method");
	}
	@PreDestroy
	public void end() {
		System.out.println("object ended");

	}
	
	
}
