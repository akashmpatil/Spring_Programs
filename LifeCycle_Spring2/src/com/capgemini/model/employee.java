package com.capgemini.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class employee {

	
private int id;
private String name;
public employee() {
System.out.println("No Arg Constructor");
}
public employee( int id,String name) {
System.out.println("in Arg-constructor");
}

public int getId() {
	return id;
}
public void setId(int id) {
	System.out.println("from setter");
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public void destroy() {
	System.out.println("Disruction");
	
	
}

public void init() {
	System.out.println("Initialization");
	
}



}
