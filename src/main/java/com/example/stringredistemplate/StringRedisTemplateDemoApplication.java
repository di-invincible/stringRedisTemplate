package com.example.stringredistemplate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author aaron
 */
@MapperScan("com.example.stringredistemplate.mapper")
@SpringBootApplication
public class StringRedisTemplateDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(StringRedisTemplateDemoApplication.class, args);
    }

}
