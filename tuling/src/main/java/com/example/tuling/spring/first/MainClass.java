package com.example.tuling.spring.first;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @??:
 * @Author EastCool·Lee
 * @Date 2019/6/7 ??10:29
 */
public class MainClass {

    public static void main(String[] args) {
        //??beans.xml??
        /*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println(context.getBean("car"));*/

        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(MainConfig.class);
        //AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(TulingFactoryBean.class);
        //System.out.println(context1.getBean("tulingFactoryBean"));
        //System.out.println(context1.getBean("&tulingFactoryBean"));
        /*for (String beanName : context1.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }*/

        //TulingService bean = (TulingService)context1.getBean("tulingService1");


        BaiduService bean = context1.getBean(BaiduService.class);
        System.out.println(bean);

        //context1.close();

    }
}
