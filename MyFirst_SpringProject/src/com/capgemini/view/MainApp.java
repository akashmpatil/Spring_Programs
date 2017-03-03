package com.capgemini.view;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.model.employee;

public class MainApp {
	
	
	public static void main(String[] args) {
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		System.out.println("Hello theire");
		employee e= applicationContext.getBean("employee",employee.class);
		
		System.out.println(e.getId());
		System.out.println(e.getName());
			
	}

}
