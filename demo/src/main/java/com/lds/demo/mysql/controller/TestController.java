package com.lds.demo.mysql.controller;

import com.lds.demo.mysql.dao.entity.IVasEntity;
import com.lds.demo.mysql.dao.entity.PassengersParamsEntity;
import com.lds.demo.mysql.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *
 * <p>
 *
 * @author EastCool·Lee
 * @date 2021/11/22 上午10:28
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("get1")
    public List<PassengersParamsEntity> findAll() {
        return testService.findAll();

    }

    @GetMapping("get2")
    public List<IVasEntity> findOne() {
        return testService.findSome();

    }
}
