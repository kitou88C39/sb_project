package com.techie.microservices.orderservice.model;

import java.math.BigDecimal;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "t_orders")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.INDENTITY)
    private Long id;
    private String orderNumber;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}
