package com.design.creational.behaviorlinkabstractfactory.impl.tvbehavior;

import com.design.creational.behaviorlinkabstractfactory.function.HandleTvBehavior;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/12/14 下午10:47
 */
public class TvBehaviorFacade2Facade extends HandleTvBehavior {
    @Override
    public void syncTvBehavior() {
        System.out.println("Facde---同步大屏行为");
    }
}
