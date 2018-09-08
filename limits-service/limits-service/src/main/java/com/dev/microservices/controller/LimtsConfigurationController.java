package com.dev.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.microservices.configuration.Configuration;
import com.dev.microservices.configuration.LimitConfigurtaions;



@RestController
public class LimtsConfigurationController {
	
	@Autowired
	Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfigurtaions getLimitsConfigurtions(){
		return new LimitConfigurtaions(configuration.getMaximum(),configuration.getMinimum());
		
	}

}
