package com.design.behavior.observer;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Observable;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/12/10 下午11:09
 */
@Data
@AllArgsConstructor
public class Shop extends Observable {

    /**
     * 商店名称
     */
    public String shopName;


    /**
     * 商品降价
     */
    public void reduceGoodsPrice(Goods goods){
        //修改状态
        setChanged();
        //通知客户
        notifyObservers(goods);
    }
}
