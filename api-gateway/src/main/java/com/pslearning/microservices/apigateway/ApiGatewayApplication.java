package com.pslearning.microservices.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiGatewayApplication {

	/*
	 * Spring Cloud Gateway
	 * - Simple, yet effective way to route to APIs
	 * - Provide cross cutting concerns: Security, Monitoring/Metrics
	 * - Built on top of Spring WebFlux (Reactive Approach)
	 * - Features: 
	 * 		- Match routes on any request attribute
	 * 		- Define Predicates and Filters
	 * 		- Integrates with Spring Cloud Discovery Client (Load Balancing)
	 * 		- Path Rewriting
	 */
	
	
	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

}
