package com.design.zuhe;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/12/8 下午11:41
 */
public class Test {

    public static void main(String[] args) {
        //v1
        SyncCms syncCms = new SyncCms();
        syncCms.postMessage();

        SyncGitv syncGitv = new SyncGitv();
        syncGitv.postMessage();

        //v2
        HandlerPostMessage handlerPostMessage = new HandlerPostMessage();
        handlerPostMessage.handleMessage(new SyncCms());
        handlerPostMessage.handleMessage(new SyncGitv());

    }
}
