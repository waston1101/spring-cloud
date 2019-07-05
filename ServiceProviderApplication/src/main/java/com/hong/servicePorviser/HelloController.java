package com.hong.servicePorviser;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class HelloController {
	
	@GetMapping("/hello")
	//@RequestMapping(method=RequestMethod.POST)
	public String hello() {
		return "hello.";
	}
}
