package com.design.creational.behaviorlinkabstractfactory.impl.tvbehavior;

import com.design.creational.behaviorlinkabstractfactory.function.HandleTvBehavior;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/12/14 下午10:45
 */
public class TvBehaviorCenter2Center extends HandleTvBehavior {
    @Override
    public void syncTvBehavior() {
        System.out.println("CMS---同步大屏行为");
    }
}
