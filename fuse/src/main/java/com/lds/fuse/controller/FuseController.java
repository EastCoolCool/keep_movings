/*
package com.lds.fuse.controller;

import com.lds.fuse.service.SyncService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

*/
/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/10/31 下午4:30
 *//*

@Data
@RestController
@Slf4j
public class FuseController {

    @Autowired
    private SyncService syncService;


    */
/**
     * 降级触发条件
     * 1,程序抛出异常,自动降级(不包括try  catch)
     * 2,接口响应超时
     * 3,并发超过规定数值
     *//*


    @RequestMapping("/test")
    @HystrixCommand(fallbackMethod = "fallbackMethod")
    public String fuse(){
        */
/*try {
            //throw new RuntimeException("111111");
            //int i = 1/0;
            //System.out.println("请求进来了");
            Thread.sleep(1000000);
            //syncService.sync();
            return "正常请求";
        } catch (Exception e) {
            System.out.println("错误请求"+e);
           return "错误请求";
        }*//*

        throw new RuntimeException("出异常了,弟弟");

    }

    public String fallbackMethod(Throwable throwable) {
        System.out.println("熔断机制触发"+throwable);
        return "熔断机制触发";

    }


}
*/
