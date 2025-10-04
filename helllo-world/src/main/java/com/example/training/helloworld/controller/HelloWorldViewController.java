package com.example.training.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class HelloWorldViewController {
	//Open Browser --http://localhost:8082/myweb/vedant
	@GetMapping("/vedant")
	public String getMethodName(Model m) {
		m.addAttribute("name","Vedant Raturi");
		m.addAttribute("city","Rishikesh");
		m.addAttribute("country","India");
		m.addAttribute("hello","Hello from Spring Boot using JSP views");
		
		return "welcome";
		
	}
	
 	
	
}
