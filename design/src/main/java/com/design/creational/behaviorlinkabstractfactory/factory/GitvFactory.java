package com.design.creational.behaviorlinkabstractfactory.factory;

import com.design.creational.behaviorlinkabstractfactory.function.HandleAppBehavior;
import com.design.creational.behaviorlinkabstractfactory.function.HandleLinkUser;
import com.design.creational.behaviorlinkabstractfactory.function.HandleTvBehavior;
import com.design.creational.behaviorlinkabstractfactory.impl.appbehavior.AppBehaviorFacade2Gitv;
import com.design.creational.behaviorlinkabstractfactory.impl.linkuser.LinkUserFacade2Gitv;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/12/14 下午10:23
 */
public class GitvFactory implements Factory {
    @Override
    public HandleLinkUser asyncMscreenLinkUser() {
        return new LinkUserFacade2Gitv();
    }

    @Override
    public HandleTvBehavior asyncTvBehavior() {
        return null;
    }

    @Override
    public HandleAppBehavior asyncAppBehavior() {
        return new AppBehaviorFacade2Gitv();
    }
}
