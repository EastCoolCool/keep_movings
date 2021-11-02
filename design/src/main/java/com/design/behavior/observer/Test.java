package com.design.behavior.observer;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/12/10 下午10:50
 */
public class Test {

    public static void main(String[] args){

        /**
         * 业务场景，商家商品降价通知客户
         */
        Shop shop = new Shop("沃尔玛超市");
        Goods goods = new Goods("营养快线",199,99);

        Customer customer1 = new Customer("詹姆斯");
        Customer customer2 = new Customer("科比");
        Customer customer = new Customer("李东帅");
        shop.addObserver(customer);
        shop.addObserver(customer1);
        shop.addObserver(customer2);

        shop.reduceGoodsPrice(goods);

    }
}
