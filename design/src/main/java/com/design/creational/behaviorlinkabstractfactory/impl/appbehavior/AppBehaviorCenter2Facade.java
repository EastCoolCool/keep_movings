package com.design.creational.behaviorlinkabstractfactory.impl.appbehavior;

import com.design.creational.behaviorlinkabstractfactory.function.HandleAppBehavior;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/12/14 下午10:48
 */
public class AppBehaviorCenter2Facade extends HandleAppBehavior {
    @Override
    public void syncAppBehavior() {
        System.out.println("Facde---同步小屏行为");
    }
}
