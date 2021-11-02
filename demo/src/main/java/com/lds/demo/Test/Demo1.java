package com.lds.demo.Test;

import com.google.common.collect.Lists;

import javax.servlet.http.HttpSession;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/11/21 下午3:14
 */
public class Demo1 {

    public void demo(HttpSession session){
        session.setAttribute("111","222");
    }

    public Demo1(String str){
        System.out.println(str);
    }

    private static volatile AtomicInteger x = new AtomicInteger(0);
    private static Object obj = new Object();
    public  int z = 10;

    public static int[] twoSum(int[] nums, int target) {

        if (nums == null || nums.length < 2) {
            return null;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    int[] r = new int[2];
                    r[0] = i;
                    r[1] = j;
                    return r;
                }
            }
        }
        return null;
    }


    public static void main(String[] args) {
        int[] arr  = {3,2,4};
        int[] ints = twoSum(arr, 6);
        for (int x :ints){
            System.out.println(x);
        }
    }

    public static Integer test() {
        return 4 & 8;
    }

    public String getStr(String str){
        return str;
    }

}
