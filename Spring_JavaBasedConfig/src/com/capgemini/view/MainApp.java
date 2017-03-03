package com.capgemini.view;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.model.helloWorld;
import com.capgemini.model.helloWorldConfig;

public class MainApp {
	   public static void main(String[] args) {
	      ApplicationContext ctx = new AnnotationConfigApplicationContext(helloWorldConfig.class);
	   
	      helloWorld helloWorld = ctx.getBean(helloWorld.class);

	      helloWorld.setMessage("Hello World!");
	     System.out.println(helloWorld.getMessage());
	   }
	}
