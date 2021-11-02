package com.lds.dubbo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.lds.dubbo.api.DubboService;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2019/3/18 下午2:56
 */
@Service(version = "2.0.1")
public class DubboServiceImpl implements DubboService {
    @Override
    public String testDubboService() {
        return "hello,this is dubbo service";
    }
}
