package com.example.tuling.spring.first;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2019/6/8 上午12:20
 */
public class Person {

    public Person() {
        System.out.println("person 构造方法");
    }

    @PostConstruct
    public void init(){
        System.out.println("person init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("person destroy");
    }
}
