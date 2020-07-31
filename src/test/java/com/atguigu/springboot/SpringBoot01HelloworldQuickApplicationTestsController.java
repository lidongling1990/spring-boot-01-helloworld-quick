package com.atguigu.springboot;

import com.atguigu.springboot.config.SpringXunHuanYiLaiConfig;
import com.atguigu.springboot.entity.StudentA;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = {SpringXunHuanYiLaiConfig.class})
class SpringBoot01HelloworldQuickApplicationTestsController {

    @Test
    public void SpringXunHuanYiLai(){

   }

}
