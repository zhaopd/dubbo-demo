package com.wish.dubboweb.controller;



import com.wish.api.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Reference
    private DemoService demoService;

    @GetMapping("/hello")
    public String hello(){
        System.out.println("hello");
        return "come into "+demoService.hello("123");
    }
}
