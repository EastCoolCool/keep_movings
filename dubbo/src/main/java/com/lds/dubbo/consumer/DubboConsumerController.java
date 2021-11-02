package com.lds.dubbo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lds.dubbo.api.DubboService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2019/3/18 下午2:53
 */
@RestController
public class DubboConsumerController {

    @Reference(version = "2.0.1")
    DubboService dubboService;

    @RequestMapping("test")
    public String test(){
        String s = dubboService.testDubboService();
        return s;
    }

}
