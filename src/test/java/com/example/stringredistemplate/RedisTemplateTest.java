package com.example.stringredistemplate;

import com.example.stringredistemplate.service.RedisServiceByRedisTemplate;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author aaron
 * @since 2021-04-13
 */
@SpringBootTest
public class RedisTemplateTest {

    @Resource
    private RedisServiceByRedisTemplate redisTemplate;


    @Test
    public void theTest(){
        redisTemplate.setAdd("111","132你好");
    }
}
