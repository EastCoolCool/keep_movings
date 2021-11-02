package com.design.creational.behaviorlinkabstractfactory.factory;

import com.design.creational.behaviorlinkabstractfactory.function.HandleAppBehavior;
import com.design.creational.behaviorlinkabstractfactory.function.HandleLinkUser;
import com.design.creational.behaviorlinkabstractfactory.function.HandleTvBehavior;
import com.design.creational.behaviorlinkabstractfactory.impl.appbehavior.AppBehaviorCenter2Facade;
import com.design.creational.behaviorlinkabstractfactory.impl.linkuser.LinkUserFacade2Facade;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/12/14 下午10:19
 */
public class FacdeFactory implements Factory {
    @Override
    public HandleLinkUser asyncMscreenLinkUser() {
        return new LinkUserFacade2Facade();
    }

    @Override
    public HandleTvBehavior asyncTvBehavior() {
        return null;
    }

    @Override
    public HandleAppBehavior asyncAppBehavior() {
        return new AppBehaviorCenter2Facade();
    }
}
