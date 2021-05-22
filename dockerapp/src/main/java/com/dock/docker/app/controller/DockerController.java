package com.dock.docker.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
    private static final Logger log= LoggerFactory.getLogger(DockerController.class);


    @GetMapping("/hi")
    public String hello(){
        log.info("enter into the hello()");

        return "Hello World";
    }
}
