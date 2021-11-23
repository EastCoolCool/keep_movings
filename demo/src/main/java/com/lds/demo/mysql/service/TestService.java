package com.lds.demo.mysql.service;

import com.lds.demo.mysql.dao.TestDaoMapper1;
import com.lds.demo.mysql.dao.entity.IVasEntity;
import com.lds.demo.mysql.dao.entity.PassengersParamsEntity;
import com.lds.demo.mysql.dao.TestDaoMapper2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *
 * <p>
 *
 * @author EastCool·Lee
 * @date 2021/11/22 上午10:28
 */
@Service
public class TestService {

    @Autowired
    private TestDaoMapper1 mapper1;

    @Autowired
    private TestDaoMapper2 mapper2;

    public List<PassengersParamsEntity> findAll(){
        return mapper1.selectAll();
    }

    public List<IVasEntity> findSome(){
        return mapper2.findSome();
    }

}
