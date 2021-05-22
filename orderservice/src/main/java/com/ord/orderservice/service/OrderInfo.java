package com.ord.orderservice.service;

import com.ord.orderservice.repository.Order;

import java.util.List;

public interface OrderInfo {

    public List<Order> getAllOrders();
    public Order addOrder(Order order);
}
