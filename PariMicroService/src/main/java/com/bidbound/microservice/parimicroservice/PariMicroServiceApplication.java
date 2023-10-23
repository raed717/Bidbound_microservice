package com.bidbound.microservice.parimicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PariMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PariMicroServiceApplication.class, args);
	}

}
