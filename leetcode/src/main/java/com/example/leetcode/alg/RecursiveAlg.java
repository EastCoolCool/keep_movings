package com.example.leetcode.alg;

import lombok.Data;

import static jdk.nashorn.internal.objects.Global.print;

/**
 * <p>
 * 递归算法
 * <p>
 *
 * @author EastCool·Lee
 * @date 2020/7/8 下午3:25
 */
public class RecursiveAlg {

    public static int run(int n) {
        if (n == 1) {
            return n;
        }
        return n + run(n - 1);
    }

    public static void main(String[] args) {
        Node node = new Node();
        node.setVal(1);

        Node node1 = new Node();
        node1.setVal(2);
        node.setNext(node1);

        Node node2 = new Node();
        node2.setVal(3);
        node1.setNext(node2);


        System.out.println(Node.count(node));
        Node.print(node);
    }


}
