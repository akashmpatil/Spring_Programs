package com.capgemini.model;

public class Employee {

	
	private Integer id;
	private String name;
	Address address;
	
	/*public Employee(Address address) {
		
	this.address=address;
	}*/
	public Employee(int id,String name,Address address) {
		super();
		System.out.println("In Employee Constructor");
		this.id=id;
		this.name=name;
		this.address=address;
	
	}
	public void showOutput()
	{
		System.out.println(id+".."+name);
		System.out.println(address);
	}
}
