package com.design.creational.abstractfactory;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/12/9 下午11:11
 */
public class SyncGitvBehavior extends SyncBehavior {
    @Override
    public void syncBehavior() {
        System.out.println("同步多屏行为给GITV");
    }
}
