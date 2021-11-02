package com.lds.demo.bean;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/11/29 下午3:12
 */
public class Student extends Person {


    @Override
    public void run() {
        super.run();
    }

    @Override
    public void eat() {
        System.out.println("子类吃饭");
    }

}
