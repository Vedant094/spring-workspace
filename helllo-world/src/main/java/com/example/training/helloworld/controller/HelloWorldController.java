package com.example.training.helloworld.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.training.helloworld.model.Employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloWorldController {
	
	//Open Browser --http://localhost:8080/myweb
	@GetMapping("/")
	public String sayHelllo() {
		return "Hello World from SpringBoot!😍😍😊😊";
	}
	
	//Open Browser -- http://localhost:8082/myweb/test
	@GetMapping("/test")
	public String getTest() {
		return "She Sells Sea Shells in the Sea.🙌🙌🙌";
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		Employee e1=new Employee(101,"James","Gosling","james@sun.com");
		Employee e2=new Employee(102,"Rod","Jhonson","rod@spring.com");
		Employee e3=new Employee(103,"Gavin","King","king@sun.com");
		Employee e4=new Employee(104,"R","V","V@sun.com");
		Employee e5=new Employee(105,"S","N","S@coforge.com");
		
		List<Employee> empList= new ArrayList<>();
	
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		
		return  empList;
	}
	
	
}
