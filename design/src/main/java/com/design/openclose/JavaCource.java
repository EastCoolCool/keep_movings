package com.design.openclose;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/12/4 下午10:57
 */
@Data
@AllArgsConstructor
public class JavaCource implements ICourse {

    private Integer id;

    private String name;

    private Double price;


}
