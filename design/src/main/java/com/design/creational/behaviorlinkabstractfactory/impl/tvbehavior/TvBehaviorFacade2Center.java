package com.design.creational.behaviorlinkabstractfactory.impl.tvbehavior;

import com.design.creational.behaviorlinkabstractfactory.function.HandleTvBehavior;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/12/14 下午10:43
 */
public class TvBehaviorFacade2Center extends HandleTvBehavior {
    @Override
    public void syncTvBehavior() {
        System.out.println("中心---同步大屏行为");
    }
}
