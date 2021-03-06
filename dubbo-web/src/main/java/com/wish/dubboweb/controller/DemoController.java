package com.wish.dubboweb.controller;


import com.wish.api.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Reference
    private DemoService demoService;

    @GetMapping("/hello")
    public String hello() {
        logger.info("hello");
        return "come into " + demoService.hello("123");
    }
}
