package com.lds.demo.mysql.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lds.demo.mysql.dao.entity.PassengersParamsEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *
 * <p>
 *
 * @author EastCool·Lee
 * @date 2021/11/22 上午10:29
 */
@Mapper
@DS("projectx")
public interface TestDaoMapper1 extends BaseMapper<PassengersParamsEntity> {

    /**
     * 测试
     * @return
     */
    List<PassengersParamsEntity> selectAll();

}
