package com.design.creational.simplefactory;


/**
 * @描述: 简单工厂--> 工厂方法模式
 * @Author EastCool·Lee
 * @Date 2018/12/9 上午12:53
 */
public class Test {

    public static void main(String[] args){
        //v1
        /*Cms cms = new Cms();
        cms.sendMessage();

        Gitv gitv = new Gitv();
        gitv.sendMessage();

        LicensePlateFactory licensePlateFactory1 = new LicensePlateFactory();
        LicensePlate cms1 = licensePlateFactory1.getLicensePlate1("cms");
        cms1.sendMessage();

        //V2 简单工厂模式
        LicensePlateFactory licensePlateFactory = new LicensePlateFactory();
        licensePlateFactory.getLicensePlate(Cms.class).sendMessage();
        licensePlateFactory.getLicensePlate(Gitv.class).sendMessage();*/

        //v3 工厂方法模式
        LicensePlateFactory licensePlateFactory = new CmsFactory();
        LicensePlate licensePlate = licensePlateFactory.getLicensePlate();
        licensePlate.sendMessage();

        LicensePlateFactory licensePlateFactory1 = new GitvFactory();
        LicensePlate licensePlate1 = licensePlateFactory1.getLicensePlate();
        licensePlate1.sendMessage();


    }
}
