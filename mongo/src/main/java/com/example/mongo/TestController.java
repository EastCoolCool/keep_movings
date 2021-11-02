package com.example.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2019/4/1 下午3:03
 */
@RestController
public class TestController {

    @Autowired
    private MongoTemplate mongoTemplate;

    @RequestMapping("demo")
    public void demo(@RequestBody Obj obj){

        mongoTemplate.save(obj,"obj");
    }
}
