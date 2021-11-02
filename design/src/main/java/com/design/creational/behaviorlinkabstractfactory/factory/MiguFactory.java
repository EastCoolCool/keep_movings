package com.design.creational.behaviorlinkabstractfactory.factory;

import com.design.creational.behaviorlinkabstractfactory.function.HandleAppBehavior;
import com.design.creational.behaviorlinkabstractfactory.function.HandleLinkUser;
import com.design.creational.behaviorlinkabstractfactory.function.HandleTvBehavior;
import com.design.creational.behaviorlinkabstractfactory.impl.tvbehavior.TvBehaviorCenter2Migu;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/12/15 上午12:33
 */
public class MiguFactory implements Factory {
    @Override
    public HandleLinkUser asyncMscreenLinkUser() {
        return null;
    }

    @Override
    public HandleTvBehavior asyncTvBehavior() {
        return new TvBehaviorCenter2Migu();
    }

    @Override
    public HandleAppBehavior asyncAppBehavior() {
        return null;
    }
}
