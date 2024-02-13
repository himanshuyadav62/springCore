package com.springCore.autoRewire;

public class Employee {

	Address address; 
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(Address adress) {
		super();
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
		this.address = address;
	}
}
