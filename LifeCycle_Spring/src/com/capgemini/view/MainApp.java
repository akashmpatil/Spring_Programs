package com.capgemini.view;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.model.employee;

public class MainApp {
	
	
	public static void main(String[] args) {
		AbstractApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");
		applicationContext.registerShutdownHook();
		System.out.println("Hello theire");
		employee e= applicationContext.getBean("employee",employee.class);
		
		System.out.println(e.getId());
		System.out.println(e.getName());
			
	}

}
