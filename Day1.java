package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Day1 {
	@GetMapping("/welcome")
	public String Welcome()
	{
	
		return "Welcome String Boot!";
	}
	
}