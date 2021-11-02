package com.rabbitmq.rabbitmq.controller;

import com.google.common.collect.Maps;
import com.rabbitmq.rabbitmq.producer.DirectProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;


/**
 * @描述: 测试类
 * @Author EastCool·Lee
 * @Date 2018/11/27 下午8:45
 */
@RestController
public class DemoController {

    @Autowired
    private DirectProducer directProducer;

    @RequestMapping("test")
    public void test() {
        directProducer.sendDirectMsg();
    }


}
