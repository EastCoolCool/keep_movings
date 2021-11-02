package com.lds.demo.service.impl;

import com.lds.demo.service.IDemoService;
import org.springframework.stereotype.Service;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/11/11 下午7:59
 */
@Service("service1")
public class IDemoServiceImpl1 implements IDemoService {
    @Override
    public String run() {
        return "第一个实现类";
    }
}
