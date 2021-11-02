package com.design.creational.behaviorlinkabstractfactory.impl.appbehavior;

import com.design.creational.behaviorlinkabstractfactory.function.HandleAppBehavior;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/12/14 下午10:46
 */
public class AppBehaviorFacade2Cms extends HandleAppBehavior {
    @Override
    public void syncAppBehavior() {
        System.out.println("CMS---同步小屏行为");
    }
}
