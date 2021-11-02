package com.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/12/20 下午10:48
 */
@RestController
public class Skill {

    @Autowired
    private RedisLock redisLock;

    /**
     * 模拟数据库表，商品表，库存表，秒杀成功订单表
     */

    //商品表
    static Map<String, Integer> products;
    //库存表
    static Map<String, Integer> stock;
    //订单表
    static Map<String, String> orders;


    static {
        products = new HashMap<>();
        stock = new HashMap<>();
        orders = new HashMap<>();
        //商品mac pro ,  限量1000份
        products.put("123", 1000);
        //商品mac pro ,  库存1000份
        stock.put("123", 1000);
    }

    @RequestMapping("skill")
    public String productSkill() {

        //加锁
        long time = System.currentTimeMillis() + 10*100;
        if(!redisLock.lock("1", String.valueOf(time))){
            return "换个姿势再试试";
        }


        //1.下单前先查看库存,无存库秒杀结束
        Integer leftStock = stock.get("123");
        if (leftStock <= 0) {
            return "秒杀活动结束";
        }

        //2.有库存,下订单
        orders.put(UUID.randomUUID().toString(), "123");

        //3.减库存
        leftStock = leftStock - 1;
        stock.put("123", leftStock);

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //解锁
        redisLock.unlock("1", String.valueOf(time));

        return "下单成功";


    }

    @RequestMapping("info")
    public String productInfo () {
        return "秒杀活动，mac pro，限量"
                + products.get("123")
                + " 还剩：" + stock.get("123") + " 份"
                + " 该商品成功下单用户数目："
                + orders.size() + " 人";
    }


    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
    }

}
