package com.example.tuling.spring.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2019/6/8 下午3:07
 */
public class BaiduService {

    @Autowired
    @Qualifier(value = "tulingService1")
    private TulingService tulingService2;

    @Override
    public String toString() {
        return "BaiduService{" +
                "tulingService=" + tulingService2 +
                '}';
    }
}
