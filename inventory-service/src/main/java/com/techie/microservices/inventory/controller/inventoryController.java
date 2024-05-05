package com.techie.microservices.inventory.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequestMapping
@RestController("/api/inventory")
@RequiredArgsConstructor
public class inventoryController {
    private final InventoryService inventoryService;

}
