package com.design.creational.behaviorlinkabstractfactory.impl.linkuser;

import com.design.creational.behaviorlinkabstractfactory.function.HandleLinkUser;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/12/14 下午10:47
 */
public class LinkUserFacade2Facade extends HandleLinkUser {
    @Override
    public void syncMscreenLinkUser() {
        System.out.println("Facde---同步多屏用户");
    }
}
