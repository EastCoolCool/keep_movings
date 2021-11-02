package com.example.leetcode.alg;

import lombok.Data;

/**
 * <p>
 *
 * <p>
 *
 * @author EastCool·Lee
 * @date 2020/7/10 下午2:55
 */
@Data
public  class Node {

    private int val;

    private Node next;


    /**
     * 递归单向链表的节点数量
     */
    public static int count(Node list) {
       /* int count = 0;
        while (list != null) {
            list = list.next;
            count++;
        }
        return count;*/
        if (list ==null){
            return 0;
        }
        return 1+count(list.next);
    }

    public static void print(Node list){
        if (null ==list){
            return;
        }

        print(list.next);
        System.out.println(list);

    }
}


