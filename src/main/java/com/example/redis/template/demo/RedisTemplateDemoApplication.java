package com.example.redis.template.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author aaron
 */
@MapperScan("com.example.redis.template.demo.mapper")
@SpringBootApplication
public class RedisTemplateDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisTemplateDemoApplication.class, args);
    }

}
