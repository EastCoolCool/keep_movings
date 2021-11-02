package com.example.tuling.spring.first;

import com.sun.media.jfxmediaimpl.MediaDisposer;
import lombok.Data;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2019/6/7 下午10:18
 */
@Data
public class Car implements InitializingBean, DisposableBean {

    private String name;

    public Car(){
        System.out.println("car construtor");
    }

   /* public Car(String name){
        this.name = name;
    }*/

    public void test(){
        System.out.println("方法调用");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("car init");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("car destroy");
    }
}
