package com.example.mongo;

import lombok.Data;

import java.util.List;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2019/4/1 下午3:01
 */
@Data
public class Obj {

    private String id;

    private List<ChildObj> data;

}
