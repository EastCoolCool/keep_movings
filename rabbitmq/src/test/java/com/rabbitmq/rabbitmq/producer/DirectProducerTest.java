package com.rabbitmq.rabbitmq.producer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/11/17 下午7:33
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DirectProducerTest {

    @Autowired
    private DirectProducer directProducer;

    @Test
    public void sendDirectMsg() {
        while (true){
            directProducer.sendDirectMsg();
        }
    }
}