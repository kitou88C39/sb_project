package com.techie.microservices.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootTest(webEnvironment = SpringBootTest.webEnvironment.RANDOM_PORT)
@AutoConfigureWireMock
class OrderServiceApplicationTests {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplicationTests.class, args);
	}

}
