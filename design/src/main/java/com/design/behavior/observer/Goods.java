package com.design.behavior.observer;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/12/10 下午11:05
 */
@Data
@AllArgsConstructor
public class Goods {

    /**
     * 商品名称
     */
    public String goodsName;

    /**
     * 商品初始价格
     */
    public Integer goodsOriginPrice;

    /**
     * 商品现在价格
     */
    public Integer goodsDiscountPrice;


}
