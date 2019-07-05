package com.hong.serviceConsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/substitution")
public class SubstitutionConsumer {
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/callHello")
	public String callHello() {
//	return restTemplate.getForObject("http://localhost:8899/demo/hello", String.class);
		return restTemplate.getForObject("http://myServer/demo/hello", String.class);
	}

}
