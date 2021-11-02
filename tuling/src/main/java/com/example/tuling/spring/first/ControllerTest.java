package com.example.tuling.spring.first;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2019/6/7 下午10:34
 */
@RestController
public class ControllerTest {

    @RequestMapping("test")
    public String test() {
        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(TulingFactoryBean.class);
        Car car = (Car) context1.getBean("tulingFactoryBean");
        car.test();
        return car.getName();
    }

}
