package com.springCore.lifeCycle;

public class Car {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Car(double price) {
		super();
		this.price = price;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Car [price=" + price + "]";
	} 
	public void init() {
		System.out.println("init method called");
	}
	public void destroy() {
		System.out.println("destroy method called");
	}
	
}
