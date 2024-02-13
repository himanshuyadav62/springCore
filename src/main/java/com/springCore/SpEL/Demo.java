package com.springCore.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{23+21}")
	private int x; 
	private int y;
	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Demo(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + "]";
	} 
	
	

}
