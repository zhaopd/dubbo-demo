package com.wish.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());



    @GetMapping("/hello")
    public String hello(){
        logger.info("hello world");
        return "hello world";
    }

}
