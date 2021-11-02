package com.design.creational.abstractfactory;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/12/9 下午11:10
 */
public class SyncGitvLinkUser extends SyncLinkUser {
    @Override
    public void syncLinkUser() {
        System.out.println("同步多屏用户给GITV");
    }
}
