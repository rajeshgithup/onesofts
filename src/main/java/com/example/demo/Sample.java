package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {
	@GetMapping ("/getthis")
	public String get() {
		return "hello world";
	}
	@RequestMapping("/addnum/{a}/{b}")
	public int add(@PathVariable int a,@PathVariable int b) {
		return a+b;
	}


}
