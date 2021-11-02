package com.design.creational.behaviorlinkabstractfactory.factory;

import com.design.creational.behaviorlinkabstractfactory.function.HandleAppBehavior;
import com.design.creational.behaviorlinkabstractfactory.function.HandleLinkUser;
import com.design.creational.behaviorlinkabstractfactory.function.HandleTvBehavior;
import com.design.creational.behaviorlinkabstractfactory.impl.linkuser.LinkUserFacade2Cms;
import com.design.creational.behaviorlinkabstractfactory.impl.appbehavior.AppBehaviorFacade2Cms;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/12/14 下午10:23
 */
public class CmsFactory implements Factory {
    @Override
    public HandleLinkUser asyncMscreenLinkUser() {
        return new LinkUserFacade2Cms();
    }

    @Override
    public HandleTvBehavior asyncTvBehavior() {
        return null;
    }

    @Override
    public HandleAppBehavior asyncAppBehavior() {
        return new AppBehaviorFacade2Cms();
    }
}
