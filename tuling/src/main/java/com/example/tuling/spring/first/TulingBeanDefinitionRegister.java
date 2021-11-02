package com.example.tuling.spring.first;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2019/6/8 上午9:17
 */
public class TulingBeanDefinitionRegister implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        //创建一个bean定义对象
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Car.class);
        //把bean定义对象导入到容器中
        registry.registerBeanDefinition("car", rootBeanDefinition);
    }
}
