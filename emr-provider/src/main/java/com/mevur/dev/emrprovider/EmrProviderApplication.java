package com.mevur.dev.emrprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
public class EmrProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmrProviderApplication.class, args);
	}
}
