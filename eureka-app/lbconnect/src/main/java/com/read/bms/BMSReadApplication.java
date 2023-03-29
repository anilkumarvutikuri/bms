package com.read.bms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BMSReadApplication {

	public static void main(String[] args) {
		SpringApplication.run(BMSReadApplication.class, args);
	}

}
