package com.capgemini.view;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.capgemini.model.Employee;


public class MainApp {

	
	public static void main(String[] args) {
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("BeanFactory.xml");
		
		
		Employee e= applicationContext.getBean("e1",Employee.class);
		e.showOutput();
		
	}
}
