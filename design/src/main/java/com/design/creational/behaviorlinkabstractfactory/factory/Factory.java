package com.design.creational.behaviorlinkabstractfactory.factory;

import com.design.creational.behaviorlinkabstractfactory.function.HandleAppBehavior;
import com.design.creational.behaviorlinkabstractfactory.function.HandleLinkUser;
import com.design.creational.behaviorlinkabstractfactory.function.HandleTvBehavior;

/**
 * @描述: 异步抽象工厂
 * @Author EastCool·Lee
 * @Date 2018/12/14 下午10:20
 */
public interface Factory {

    /**
     * 同步多屏用户
     */
    HandleLinkUser asyncMscreenLinkUser();

    /**s
     * 同步大屏行为
     */
    HandleTvBehavior asyncTvBehavior();

    /**
     * 同步小屏行为
     */
    HandleAppBehavior asyncAppBehavior();
}
