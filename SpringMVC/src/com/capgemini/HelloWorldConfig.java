package com.capgemini;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller  
public class HelloWorldConfig {  
    @RequestMapping("/hello")  
    public ModelAndView helloWorld() {  
        String message = "HELLO SPRING MVC HOW R U";  
        return new ModelAndView("hellopage", "message", message);  
    }  
} 
/*@Controller
@RequestMapping("/hello")
public class HelloWorldConfig {

@RequestMapping(method = RequestMethod.GET)
public String helloWorld(ModelMap model, HttpServletRequest request) {
    String message = "Hello World, Spring 3.0!";
    System.out.println(message);
    model.addAttribute("message", message);
    return "hellopage";
}*/
