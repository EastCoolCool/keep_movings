package com.design.zuhe;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/12/8 下午11:44
 */
public class HandlerPostMessage {


    public void handleMessage(SyncBehavior syncBehavior){
        syncBehavior.postMessage();
    }
}
