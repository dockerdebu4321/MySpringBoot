package com.ey.practice.SpringBootPractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/Vehicle")
public class VehicleController {
	
	@GetMapping(path="/Welcome")
	public String WelcomeMessage() {
		
		return "Welcome to Vehicle controller";
	}
}
