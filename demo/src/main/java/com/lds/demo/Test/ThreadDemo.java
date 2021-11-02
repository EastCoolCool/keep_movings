package com.lds.demo.Test;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/11/19 下午12:20
 */
public class ThreadDemo {

    public static void main(String[] args) throws Exception {
        MyThread mt = new MyThread();
        mt.start();
        OtherThread ot = new OtherThread();
        ot.start();
        for (int i =0 ;i<10;i++){
            Thread.sleep(1);
            System.out.println("ccccccc");
        }

    }


    public void demo(){

    }

}

class MyThread extends Thread {

    public void run() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("aaaaaaaaaaa");

    }
}

class OtherThread extends Thread {
    public void run() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("bbbb");
    }
}
