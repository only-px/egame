package com.px.egame;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

//扫描 mybatis mapper 包路径
@MapperScan(basePackages = "com.px.egame.mapper")

//扫描 所有需要的包, 包含一些自用的工具类包 所在的路径
//@ComponentScan(basePackages= {"com.px.egame"})
//开启定时任务
@EnableScheduling
//开启异步调用方法
@EnableAsync
@SpringBootApplication
public class EgameApplication {

    public static void main(String[] args) {
        SpringApplication.run(EgameApplication.class, args);
    }
}
