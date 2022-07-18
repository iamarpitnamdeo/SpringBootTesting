package com.example.Junit.Testing1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping
	public String home() {
		return "Hello World! From Arpit";
	}
	@RequestMapping("/greet")
	public @ResponseBody String greeting() {
		return "Hello, World!!!";
	}
}
