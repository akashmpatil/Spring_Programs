package com.capgemini.model;

public class Address {

	
	private String addressLine,city,state,Country;
	
	
	public Address(String addressLine,String city,String state,String Country) {
super();
System.out.println("Hi in Address Constructor");
this.addressLine=addressLine;
this.city=city;
this.state=state;
this.Country=Country;
	}


	@Override
	public String toString() {
		return "Address [addressLine=" + addressLine + ", city=" + city + ", state=" + state + ", Country=" + Country
				+ "]";
	}
}
