package com.wish.dubboservice.service.impl;

import com.wish.api.DemoService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String hello(String name) {
        System.out.println("0000000000000000");
        return name;
    }
}
