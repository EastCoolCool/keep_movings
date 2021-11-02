package com.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private MyThread myThread;


    /**
     * redis五种数据结构
     * <p>
     * String 字符串                     ValueOperations
     * list   单列有序集合(不去重)         ListOperations
     * hash   双列结合,类似于Map          HashOperations
     * set    单列无序集合(去重)              SetOperations
     * zset   单列有序集合(去重且有序)       ZSetOperations
     */

    @Test
    public void setRedis1() {

        /**
         * String
         */
        //redisTemplate.opsForValue().set("lds", "1111111");

        /**
         * list
         */
        ArrayList<String> list = new ArrayList<>();
        list.add("aaaaaa");
        redisTemplate.opsForList().leftPushAll("list", list);

        /**
         * hash
         */
        //redisTemplate.opsForHash().put("person","name","eastcool1");
        //redisTemplate.opsForHash().put("person","age","24");
        /*LinkedHashMap hashMap = new LinkedHashMap();
        hashMap.put("name","李东帅");
        hashMap.put("age",15);
        hashMap.put("sex","male");
        redisTemplate.opsForHash().putAll("student",hashMap);*/


        /**
         * set
         */
        /*Set<String> set = new HashSet<>();
        set.add("1111");
        set.add("2222");
        set.add("3333");*/

        //set.add("4444");
        //set.add("5555");

        //redisTemplate.opsForSet().add("set",set);

        redisTemplate.opsForZSet().add("set1","1111",1.2);
        //redisTemplate.opsForZSet().add("set1","2222",1.1);


    }


    @Test
    public void getRedis1() {

        /**
         * String
         */
//        String lds = (String) redisTemplate.opsForValue().get("lds");
//        System.out.println(lds);

        /**
         * list
         */
        List<String> list = (List) redisTemplate.opsForList().range("list", 0, -1);
        System.out.println(list.toString());

        /**
         * hash
         */
        //List person = redisTemplate.opsForHash().values("person");
        //System.out.println(person.toString());
        //List student = redisTemplate.opsForHash().values("student");
//        System.out.println(student.toString());


        /**
         * set
         */
        //Set set = redisTemplate.opsForSet().members("set");
        //System.out.println(set.toString());


        /**
         * zset
         */
        //Set set1 = redisTemplate.opsForZSet().range("set1", 0, -1);
        //System.out.println(set1.toString());
    }

    
    /**
     * redis事物测试
     */
    @Test
    public void tranctionRedis() {
        //开启事物
        //redisTemplate.setEnableTransactionSupport(true);
        //redisTemplate.multi();
        //redisTemplate.opsForValue().set("lds", "1111111111");
        //多线程
        //myThread.start();
        //提交事物
        //redisTemplate.exec();

    }

    public static void main(String[] args){
        System.out.println(demp());
    }


    public  static int demp(){
        int value  = 2;
        try {
            return value  = value*value;
        } finally {
            System.out.println("######");
            System.out.println(value);
            System.out.println("######");
        }
    }

}



