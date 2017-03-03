package com.capgemini.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class UrlBasedSpringResover extends AbstractController { 

    @Override

protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)throws Exception {

String Message = "This is URL Based View Resolver Test Example."; 

ModelAndView modelAndView = new ModelAndView("message");

modelAndView.addObject("message", Message); 

return modelAndView;

}

	
}