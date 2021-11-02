package com.lds.demo.service.impl;

import com.lds.demo.service.IDemoService;
import org.springframework.stereotype.Service;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/11/11 下午7:59
 */
@Service("service2")
public class IDemoServiceImpl2 implements IDemoService {
    @Override
    public String run() {
        return "第二个实现类";
    }
}
