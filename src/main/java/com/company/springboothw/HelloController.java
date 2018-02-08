package com.company.springboothw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sayhello")
public class HelloController {

	
	@GetMapping
	public String hello(){
		return "Hello World.";
	}
	
}
