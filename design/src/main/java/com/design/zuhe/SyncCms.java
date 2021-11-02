package com.design.zuhe;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/12/8 下午11:39
 */
public class SyncCms extends SyncBehavior{
    @Override
    public void postMessage() {
        System.out.println("消息发送给未来电视");
    }
}
