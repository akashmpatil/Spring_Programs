package com.capgemini.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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
@PreDestroy
public void destroy() throws Exception {
	System.out.println("Disruction");
	
	
}
@PostConstruct
public void afterPropertiesSet() throws Exception {
	System.out.println("Initialization");
	
}



}
