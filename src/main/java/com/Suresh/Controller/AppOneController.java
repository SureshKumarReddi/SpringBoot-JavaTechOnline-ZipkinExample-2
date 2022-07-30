package com.Suresh.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AppOneController {

	private Logger logger = LoggerFactory.getLogger(AppOneController.class);
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/m2")
	public String methodTwo() {
		logger.info(" *********** inside method two *********** ");
		String response = restTemplate.getForObject("http://localhost:9092/m3", String.class);
		logger.info("*******response from MicroService -2 *********  " +response);
		return " returning from microservice 02 ";
	}
}
