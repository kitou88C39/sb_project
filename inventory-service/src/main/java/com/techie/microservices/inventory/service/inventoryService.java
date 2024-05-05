package com.techie.microservices.inventory.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class inventoryService {

    private final InventortRepository inventortRepository;

    public boolean isInStock(String skuCode, Integer quantity) {
        return inventortRepository.existsBySkuCodeAndQuantityIsGreaterThanEquals(skuCode, quantity);
    }
}