package com.techie.microservices.order.service;

import com.techie.microservices.order.dto.OrderRequest;
import com.techie.microservices.order.model.Order;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {

    public void placeOrder(OrderRequest orderRequest) {
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        order.setPrice(orderRequest.price());
        order.setSkuCode(orderRequest.skuCode());

    }

}
