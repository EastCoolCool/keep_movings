package com.design.creational.simplefactory;

/**
 * @描述: 简单工厂模式
 * @Author EastCool·Lee
 * @Date 2018/12/9 上午12:55
 */
public abstract class LicensePlateFactory {


    public abstract LicensePlate getLicensePlate();

    //v1 简单判断
    /*public LicensePlate getLicensePlate1(String type) {

        if(type.equalsIgnoreCase("cms")){
            return new Cms();
        }
        if(type.equalsIgnoreCase("cms")){
            return new Gitv();
        }
        return null;
    }*/

    //反射判断
    /*public LicensePlate getLicensePlate(Class clz) {

        LicensePlate licensePlate = null;
        try {
            licensePlate = (LicensePlate) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return licensePlate;
    }*/




}
