package com.spring.controller;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin()
@EnableEurekaClient
public class SpringSecurityController {

	@GetMapping("/spring")
	public String myFirstSpringTest() {
		return "My First Spring Securtiy Project";
	}

}
