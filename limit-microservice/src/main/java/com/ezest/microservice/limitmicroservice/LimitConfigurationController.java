package com.ezest.microservice.limitmicroservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ezest.microservice.limitmicroservice.bean.Configuration;
import com.ezest.microservice.limitmicroservice.bean.LimitConfiguration;

@RestController
public class LimitConfigurationController {
	@Autowired
	private Configuration config;
	
	@GetMapping("/limits")
	public LimitConfiguration retriveLimitfromConfig() {
		return new LimitConfiguration(config.getMaximum(),config.getMinimum());
	}
}
