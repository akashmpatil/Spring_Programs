package com.capgemini.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	private Integer id;
	private String name;
	Address address;
	
	/*public Employee(Address address) {
		
	this.address=address;
	}*/
	/*public Employee(int id,String name,Address address) {
		super();
		System.out.println("In Employee Constructor");
		this.id=id;
		this.name=name;
		this.address=address;
	
	}*/
	public void showOutput()
	{
		System.out.println(id+".."+name);
		System.out.println(address);
	}
}
