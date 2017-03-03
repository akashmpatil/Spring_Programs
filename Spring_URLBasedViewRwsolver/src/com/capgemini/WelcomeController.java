package com.capgemini;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/myworld")
public class WelcomeController {
	@RequestMapping("/welcome")
        public String hello(Model model) {
	    model.addAttribute("msg", "UrlBasedViewResolver Demo");
            return "success";
	}
} 
