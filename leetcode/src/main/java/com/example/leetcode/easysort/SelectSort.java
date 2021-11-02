package com.example.leetcode.easysort;

/**
 * <p>
 * 选择排序:
 * 每次把最小的一个放到第一个元素
 * 前i个元素是有序的
 * <p>
 *
 * @author EastCool·Lee
 * @date 2020/7/8 下午2:31
 */
public class SelectSort {

    public static int[] sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp =arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {7, 3, 1,4,2,10,8,5};
        int[] sort = sort(arr);
        for (int x : sort) {
            System.out.println(x);
        }
    }

}
