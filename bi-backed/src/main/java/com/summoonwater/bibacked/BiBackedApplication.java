package com.summoonwater.bibacked;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author SummoonWater
 * @date 2024/8/22 12:07
 * @description 入口类
 */
@SpringBootApplication
@MapperScan()
//@EnableCaching("com.summoonwater.bibacked.mapper")
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
public class BiBackedApplication {

    public static void main(String[] args) {
        SpringApplication.run(BiBackedApplication.class, args);
    }

}
