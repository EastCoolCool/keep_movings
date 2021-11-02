package com.lds.demo.Test;

/**
 * <p>
 *
 * <p>
 *
 * @Author EastCool·Lee
 * @Date 2020/6/16 下午8:17
 */
public class Sisuo implements Runnable {

    private static Object o1 = new Object(), o2 = new Object();

    private int flag = 1;


    @Override
    public void run() {
        System.out.println("flag =" + flag);
        if (flag == 1) {
            synchronized (o1) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o2) {
                    System.out.println("111111");
                }
            }
        }

        if (flag == 0) {
            synchronized (o2) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o1) {
                    System.out.println("000000");
                }
            }
        }
    }

    public static void main(String[] args) {
        Sisuo sisuo1 = new Sisuo();
        Sisuo sisuo2 = new Sisuo();
        sisuo1.flag = 0;
        sisuo2.flag = 1;

        new Thread(sisuo1).start();
        new Thread(sisuo2).start();

    }
}
