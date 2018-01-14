package com.lazyspring.myApp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LazyController {

	Logger logger = LoggerFactory.getLogger(LazyController.class);

    @GetMapping("/echo")
    public String status() {
        logger.info("Echo Service EndPoint Called");
        return "Hello !! The service is up and running";
    }
}
