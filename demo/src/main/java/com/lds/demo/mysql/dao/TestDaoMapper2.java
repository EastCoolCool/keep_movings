package com.lds.demo.mysql.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.lds.demo.mysql.dao.entity.IVasEntity;
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
@DS("ivas")
public interface TestDaoMapper2 {
    List<IVasEntity> findSome();
}
