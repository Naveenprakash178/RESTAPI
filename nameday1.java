package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class nameday1 {
@GetMapping("/")
public String getName()
{
	String name="Naveen";
	return "Welcome "+name+"!";
}
}
