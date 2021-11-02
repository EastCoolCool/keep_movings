package com.example.tuling.spring.first;

import org.springframework.context.annotation.*;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2019/6/7 下午10:19
 */
@Configuration
//@Import(value = {Person.class, TulingImportSelector.class})
//@Import(value = {Person.class,TulingBeanDefinitionRegister.class})
@PropertySource(value = {"classpath:application.yml"})
public class MainConfig {


    /**
     * 两个bean的前后顺序  对结构有影响有明显影响
     */
  /*  @Bean
    public Person person(){
        return new Person();
    }

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Dog dog(){
        return new Dog();
    }*/

    /*@Bean
    public Car car(){
        return new Car();
    }

    @Bean
    public SuperMan superMan(){
        return new SuperMan();
    }

    @Bean
    public TulingBeanPostProcessor tulingBeanPostProcessor(){
        return new TulingBeanPostProcessor();
    }*/

   /* @Bean
    public Student student(){
        return new Student();
    }*/

   @Bean
    public TulingService tulingService1(){
       return new TulingService(1);
   }

    @Bean
    public TulingService tulingService2(){
        return new TulingService(2);
    }

    @Bean
    public BaiduService baiduService(){
       return new BaiduService();
    }

}
