package com.design.creational.abstractfactory;


/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/12/9 下午11:10
 */
public class GitvFactory implements Factory {
    @Override
    public SyncLinkUser getLinkUser() {
        return new SyncGitvLinkUser();
    }

    @Override
    public SyncBehavior getBehavior() {
        return new SyncGitvBehavior();
    }
}
