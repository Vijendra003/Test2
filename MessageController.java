package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MessageController {
	@RequestMapping("/hello") 
	public ModelAndView helloWorld() {  
        String message = "Hello..";  
        return new ModelAndView("hellopage", "message", message);  
    }  
}
