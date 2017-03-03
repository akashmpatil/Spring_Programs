package com.capgemini.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.model.Myproperty_ConfigClass;

public class MyApp {

	 public static void main(String a[]){
	       String confFile = "XmlConfig.xml";
	        ConfigurableApplicationContext context
	                                = new ClassPathXmlApplicationContext(confFile);
	        Myproperty_ConfigClass MyConfig = (Myproperty_ConfigClass) context.getBean("configClass");
	        System.out.println(MyConfig);
	        context.close();
	    }

}
