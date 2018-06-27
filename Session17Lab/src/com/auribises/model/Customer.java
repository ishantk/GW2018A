package com.auribises.model;

public class Customer {
	
	public int cid;
	public String name;
	public String phone;
	public String email;
	public int age;
	
	public Customer(){
		
	}
	
	public Customer(int cid, String name, String phone, String email, int age) {
		this.cid = cid;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", phone=" + phone + ", email=" + email + ", age=" + age
				+ "]";
	}
	
}
