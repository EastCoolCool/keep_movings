package com.lds.demo.bean;


/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/11/29 下午3:11
 */
public /*abstract*/ class Person {

    public void run() {
        System.out.println("跑步");
        eat();
    }

    public void eat(){
        System.out.println("父类吃饭");
        //run();
    }


}
