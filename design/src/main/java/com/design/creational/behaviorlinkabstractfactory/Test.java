package com.design.creational.behaviorlinkabstractfactory;

import com.design.creational.behaviorlinkabstractfactory.factory.FacdeFactory;
import com.design.creational.behaviorlinkabstractfactory.factory.Factory;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/12/14 下午10:48
 */
public class Test {

    public static void main(String[] args){

        /**
         * 多屏用户
         *
         *          分省
         *  分省  中心   CMS  GITV
         *
         */
        Factory factory1 = new FacdeFactory();
        factory1.syncMscreenLinkUser();

    }
}
