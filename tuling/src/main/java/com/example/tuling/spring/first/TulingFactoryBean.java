package com.example.tuling.spring.first;

import org.springframework.beans.factory.FactoryBean;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2019/6/8 上午9:25
 */
public class TulingFactoryBean implements FactoryBean<Car> {
    @Override
    public Car getObject() throws Exception {
        Car car = new Car();
        car.setName("hello kitty");
        return car;
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
