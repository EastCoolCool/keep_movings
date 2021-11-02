package com.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/12/20 下午2:22
 */
@Service
public class MyThread extends Thread{

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public void run() {
        Object lds = redisTemplate.opsForValue().get("lds");
        System.out.println(lds.toString());
    }

}
