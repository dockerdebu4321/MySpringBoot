package com.ey.practice.SpringBootPractice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ey.practice.SpringBootPractice.bean.EmployeeBean;
import com.ey.practice.SpringBootPractice.service.EmployeeService;

@RestController
@RequestMapping(path="/Vehicle")
public class VehicleController{ 
	
	@GetMapping(path="/Welcome")
	public String WelcomeMessage() {
		
		return "Welcome to Vehicle controller";
	}
	
}
