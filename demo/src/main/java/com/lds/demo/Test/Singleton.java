package com.lds.demo.Test;

/**
 * <p>
 *
 * <p>
 *
 * @Author EastCool·Lee
 * @Date 2020/6/16 下午8:00
 */
public class Singleton {

    /**
     * 私有构造
     */
    private Singleton() {
    }

    /**
     * 创建对象
     */
    private static Singleton singleton = new Singleton();

    /**
     * 公共的访问方式
     */
    public static Singleton getInstance() {
        return singleton;
    }
}
