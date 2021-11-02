package com.design.creational.abstractfactory;

/**
 * @描述: 抽象工厂模式客户端
 * @Author EastCool·Lee
 * @Date 2018/12/9 下午10:59
 */
public class Test {

    public static void main(String[] args){
        Factory factory = new CmsFactory();
        SyncBehavior behavior = factory.getBehavior();
        SyncLinkUser linkUser = factory.getLinkUser();
        behavior.syncBehavior();
        linkUser.syncLinkUser();

        Factory factory1 = new GitvFactory();
        SyncBehavior behavior1 = factory1.getBehavior();
        SyncLinkUser linkUser1 = factory1.getLinkUser();
        behavior1.syncBehavior();
        linkUser1.syncLinkUser();
    }
}
