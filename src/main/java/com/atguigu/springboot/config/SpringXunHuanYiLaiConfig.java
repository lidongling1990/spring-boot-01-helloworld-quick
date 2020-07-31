package com.atguigu.springboot.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.atguigu.springboot.entity"})
public class SpringXunHuanYiLaiConfig {
    public static void main(String[] args) {
        System.out.println("哈哈哈");
    }
}
