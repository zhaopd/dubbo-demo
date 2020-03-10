package com.wish.dubboservice;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableDubbo
@PropertySource("classpath:/spring/dubbo-provider.properties")
@MapperScan("com.wish.dubboservice.mapper")
public class DubboServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboServiceApplication.class, args);
    }

}
