package com.ample16.springcloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConsumerApplication2 {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication2.class, args);
	}
}
