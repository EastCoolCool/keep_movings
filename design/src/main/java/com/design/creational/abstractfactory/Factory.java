package com.design.creational.abstractfactory;

import com.design.creational.abstractfactory.SyncBehavior;
import com.design.creational.abstractfactory.SyncLinkUser;

/**
 * @描述: 总工厂
 * @Author EastCool·Lee
 * @Date 2018/12/9 下午11:02
 */
public interface Factory {

    SyncLinkUser getLinkUser();

    SyncBehavior getBehavior();

}
