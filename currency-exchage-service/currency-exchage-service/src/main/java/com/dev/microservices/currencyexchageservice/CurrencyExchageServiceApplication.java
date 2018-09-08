package com.dev.microservices.currencyexchageservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.dev.microservices")
@EntityScan("com.dev.microservices.model")
@SpringBootApplication
@EnableDiscoveryClient
public class CurrencyExchageServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchageServiceApplication.class, args);
	}
}
