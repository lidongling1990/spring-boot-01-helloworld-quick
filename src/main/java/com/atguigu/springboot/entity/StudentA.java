package com.atguigu.springboot.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class StudentA {
    private StudentA stua ;
    @Autowired
    public void setStub(StudentA stua) {
        this.stua = stua;
    }

    public StudentA getStub() {
        return stua;
    }
}
