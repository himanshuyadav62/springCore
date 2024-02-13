package com.springCore.autoRewire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	@Autowired
	@Qualifier("address")
	Address address; 
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(Address adress) {
		super();
		System.out.println("constructor of EmployeeClass");
		this.address = adress;
	}
	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		System.out.println("setter method of EMployee");
		this.address = address;
	}
}
