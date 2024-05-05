package com.techie.microservices.inventory.controller;

import com.techie.microservices.inventory.service.InventoryService;
import com.techie.microservices.inventory.service.inventoryService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;

@RequestMapping
@RestController("/api/inventory")
@RequiredArgsConstructor
public class inventoryController {
    private final inventoryService inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public boolean isInStock(@RequestParam String skuCode, @RequestParam Integer quantity) {
        return inventoryService.isInStock(skuCode, quantity);
    }
}