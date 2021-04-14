package com.example.redis.template.demo;

import com.example.redis.template.demo.service.StringRedisService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class RedisTemplateDemoApplicationTests {

    @Resource
    private StringRedisService stringRedisService;

    @Test
    void contextLoads() {

        stringRedisService.set("1","1");

        System.out.println("123456");
    }

}
