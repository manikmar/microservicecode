package com.zul.cloud.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/userServiceFallBackMethod")
    public String userFallBackMethod(){
        return "User Service is taking longer then Expected." +
                "Please try again later.";
    }

    @GetMapping("/orderServiceFallBackMethod")
    public String orderFallBackMethod(){
        return "Order Service is taking longer then Expected." +
                "Please try again later.";
    }
}
