package com.example.kafka.producer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * <p>
 *
 * <p>
 *
 * @author EastCool·Lee
 * @date 2020/7/6 上午11:27
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoProducerTest {

    @Autowired
    private DemoProducer demoProducer;

    @Test
    public void sendMsg() {
    }
}