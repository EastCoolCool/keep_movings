package com.design.creational.abstractfactory;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/12/9 下午10:55
 */
public class SyncCmsBehavior extends SyncBehavior {
    @Override
    public void syncBehavior() {
        System.out.println("多屏行为同步给CMS");
    }
}
