package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String greet() {
		String visitor = System.getenv().getOrDefault("VISITOR", "Anonymous");
		return "Hello " + visitor;
	}
	
	@GetMapping("/")
	public String index() {
		return "Welcome to App 2";
	}

}
