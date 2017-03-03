package com.capgemini.model;

public class Myproperty_ConfigClass {
    String id;
 	String name;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Myproperty_ConfigClass [id=" + id + ", name=" + name + "]";
	}
}
