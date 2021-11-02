package com.rabbitmq.rabbitmq.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2019/1/14 下午4:12
 */
@Data
@AllArgsConstructor
public class LinkedUser implements Serializable {

    private Long uid;
    private String phoneNo;
}
