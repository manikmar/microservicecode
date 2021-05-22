package com.ord.orderservice.controller;


import com.ord.orderservice.repository.Order;
import com.ord.orderservice.service.OrderInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    //9001

    @Autowired
    OrderInfo orderInfo;

    @GetMapping(value = "/get_all_orders")
    public List<Order> getAllOrders() {
        return orderInfo.getAllOrders();
    }

    @PostMapping("/add_order")
    public Order addOrder(@RequestBody Order order) {
        return orderInfo.addOrder(order);
    }
}
