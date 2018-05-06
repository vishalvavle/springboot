package com.vavle.springboot.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResouce {

	@GetMapping("/hello/{name}")
	public String sayHello(@PathVariable String name) {
		return "Hello " + name;
	}
	
	@GetMapping("/sum/{a}")
	public int sum(@PathVariable int a) {
		return a+ 20;
	}
}
