package com.design.creational.behaviorlinkabstractfactory.impl.appbehavior;

import com.design.creational.behaviorlinkabstractfactory.function.HandleAppBehavior;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/12/14 下午10:44
 */
public class AppBehaviorCenter2Center extends HandleAppBehavior {
    @Override
    public void syncAppBehavior() {
        System.out.println("中心---同步小屏行为");
    }
}
