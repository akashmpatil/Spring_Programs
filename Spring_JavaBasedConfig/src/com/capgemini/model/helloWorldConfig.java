package com.capgemini.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class helloWorldConfig {

   @Bean 
   public helloWorld helloWorld(){
      return new helloWorld();
   }
}