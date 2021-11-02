package com.design.creational.behaviorlinkabstractfactory.factory;

import com.design.creational.behaviorlinkabstractfactory.function.HandleAppBehavior;
import com.design.creational.behaviorlinkabstractfactory.function.HandleLinkUser;
import com.design.creational.behaviorlinkabstractfactory.function.HandleTvBehavior;
import com.design.creational.behaviorlinkabstractfactory.impl.linkuser.LinkUserFacade2Center;
import com.design.creational.behaviorlinkabstractfactory.impl.appbehavior.AppBehaviorCenter2Center;
import com.design.creational.behaviorlinkabstractfactory.impl.tvbehavior.TvBehaviorCenter2Center;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/12/14 下午10:22
 */
public class ToCenterFactory implements Factory {
    @Override
    public HandleLinkUser asyncMscreenLinkUser() {
        return new LinkUserFacade2Center();
    }

    @Override
    public HandleTvBehavior asyncTvBehavior() {
        return new TvBehaviorCenter2Center();
    }

    @Override
    public HandleAppBehavior asyncAppBehavior() {
        return new AppBehaviorCenter2Center();
    }
}
