package com.lds.demo.resttemplate;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2019/1/23 下午2:48
 */
@RestController
public class RestTemplateController {

    @RequestMapping("rest")
    public String rest(@RequestBody Behavior behavior){
        System.out.println(behavior);
        return "success";
    }

    @DeleteMapping("rest1")
    public String rest(String username,Integer age){
        System.out.println(username);
        System.out.println(age);
        return "success";
    }
}
