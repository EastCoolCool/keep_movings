package com.design.creational.simplefactory;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/12/9 下午9:13
 */
public class GitvFactory extends LicensePlateFactory {

    @Override
    public LicensePlate getLicensePlate() {
        return new Gitv();
    }
}
