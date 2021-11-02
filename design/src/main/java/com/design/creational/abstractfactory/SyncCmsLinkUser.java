package com.design.creational.abstractfactory;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/12/9 下午10:55
 */
public class SyncCmsLinkUser extends SyncLinkUser {
    @Override
    public void syncLinkUser() {
        System.out.println("多屏用户同步给CMS");
    }
}
