package com.techie.microservices.order.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "inventory", url = "http://localhost:8082")
public class inventoryClient {

}
