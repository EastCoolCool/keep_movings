package com.lds.fuse.config;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

import java.lang.annotation.Annotation;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/12/7 下午4:09
 */
public class TestImpl implements HystrixProperty {

    private String name;

    public String value;

    public TestImpl(String name, String value) {
        this.name = name;
        this.value = value;
    }


    @Override
    public String name() {
        return name;
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
