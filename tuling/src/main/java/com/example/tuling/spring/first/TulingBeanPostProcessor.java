package com.example.tuling.spring.first;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2019/6/8 上午10:23
 */
//@Component
public class TulingBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(bean.toString() + "BeanPostProcessor init");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(bean.toString() + "BeanPostProcessor destroy");
        return bean;
    }
}
