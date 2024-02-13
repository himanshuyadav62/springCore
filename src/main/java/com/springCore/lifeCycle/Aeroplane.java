package com.springCore.lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Aeroplane implements InitializingBean,DisposableBean {
	private int price;

	@Override
	public String toString() {
		return "Aeroplane [price=" + price + "]";
	}

	public Aeroplane(int price) {
		super();
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy method called");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("init method called");

	}

	public Aeroplane() {
		super();
		// TODO Auto-generated constructor stub
	} 
	public void start() {
		System.out.println("init mehtod called");
	}
	public void end() {
		System.out.println("destroy method called");

	}
}
