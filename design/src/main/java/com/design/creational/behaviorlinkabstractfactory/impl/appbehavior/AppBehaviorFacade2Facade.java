package com.design.creational.behaviorlinkabstractfactory.impl.appbehavior;

import com.design.creational.behaviorlinkabstractfactory.function.HandleAppBehavior;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/12/15 上午12:53
 */
public class AppBehaviorFacade2Facade extends HandleAppBehavior {
    @Override
    public void syncAppBehavior() {
        System.out.println("中心-->中心  小屏行为");
    }
}
