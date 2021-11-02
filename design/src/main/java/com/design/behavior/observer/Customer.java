package com.design.behavior.observer;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Observable;
import java.util.Observer;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/12/10 下午11:06
 */
@Data
@AllArgsConstructor
public class Customer implements Observer {

    /**
     * 客户名称
     */
    public String userName;

    @Override
    public void update(Observable o, Object arg) {
        Shop shop = (Shop) o;
        Goods goods = (Goods) arg;
        System.out.println(shop.getShopName()+"大促销，"+goods.goodsName + "，原价：" + goods.goodsOriginPrice + "，现价：" + goods.goodsDiscountPrice+"，尊敬的"+this.userName+"赶紧抢购去吧");
    }
}
