package com.APIporject.productmanagement.orderservice.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/order")

public class Ordercontroller {
    public String PlaceOrder(@RequestBody OrderRequest orderRequest) {
        return "Order placed successfully";
    }
}
