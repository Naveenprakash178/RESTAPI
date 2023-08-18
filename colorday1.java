package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class colorday1 {
	
	@GetMapping("ji")
	public String getMyFav()
	{
		String colour="Blue";
		return "My Favorite colour is "+colour;
	}

}
