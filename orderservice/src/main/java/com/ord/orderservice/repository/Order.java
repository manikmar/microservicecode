package com.ord.orderservice.repository;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("orderinfo")
public class Order {

    @Id
    private String id;
    private String name;
    private String date;
    private String price;
    private String count;

    public Order() {
    }

    public Order(String name, String date, String price, String count) {
        this.name = name;
        this.date = date;
        this.price = price;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", price='" + price + '\'' +
                ", count='" + count + '\'' +
                '}';
    }
}
