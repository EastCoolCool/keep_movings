package com.design.creational.abstractfactory;

/**
 * @描述: CMS工厂
 * @Author EastCool·Lee
 * @Date 2018/12/9 下午10:57
 */
public class CmsFactory implements Factory {

    public SyncLinkUser getLinkUser(){
        return new SyncCmsLinkUser();
    }

    public SyncBehavior getBehavior(){
        return new SyncCmsBehavior();
    }
}
