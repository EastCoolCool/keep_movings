package com.lds.demo;

import com.google.common.collect.Maps;
import com.lds.demo.resttemplate.Behavior;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DemoApplicationTests {

   /* @Autowired
    private LinkHttpUtils linkHttpUtils;

    @Test
    public void contextLoads() {
        Behavior behavior = new Behavior("eastcool",25);
        //String body = JSON.toJSONString(behavior);
        //String post = linkHttpUtils.post("http://localhost:8081/rest", behavior);
        HashMap<String, Object> map = Maps.newHashMap();
        map.put("username",behavior.getUsername());
        map.put("age",behavior.getAge());
        String post = linkHttpUtils.delete("http://localhost:8081/rest1", map);
        System.out.println(post);
    }*/

    @Value("${test}")
    private String test;
    @Test
    public void  demo(){
        System.out.println(test);
        log.info(test);
    }

}
