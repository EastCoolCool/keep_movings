package com.lds.demo.Test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2019/6/10 下午3:28
 */
public class CasTest {

    private static AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    //每个线程让count自增100次
                    for (int i = 0; i < 100; i++) {
                        count.getAndIncrement();
                    }
                }
            }).start();
        }
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(count);
    }

}
