package com.example.tuling.spring.first;


/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2019/6/8 上午10:05
 */
public class Dog {

    public Dog(){
        System.out.println("dog 构造方法");
    }

    public void init(){
        System.out.println("dog init 初始化");
    }

    public void destroy(){
        System.out.println("dog destroy 销毁");
    }
}
