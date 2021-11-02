package com.example.leetcode.easysort;

import java.util.Arrays;

/**
 * <p>
 * 插入排序:
 * 前i个元素是有序的
 * <p>
 *
 * @author EastCool·Lee
 * @date 2020/7/8 上午11:46
 */
public class InsertSort {

    public static int[] sort(int[] nums) {



        for (int i = 1; i < nums.length; i++) {

            //需要拿出来insert的数字
            int elem = nums[i];

            //从elem前面的一个开始逐个进行比较
            int j = i - 1;

            //循环比较,小于前面一个就置换
            while (j >= 0 && elem < nums[j]) {
                int temp  = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
                j--;
            }

        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {6, 1, 4, 7, 5};
        int[] sortArr = sort(arr);
        int[] cloneArr = Arrays.copyOf(arr, arr.length);
        if (sortArr.equals(cloneArr)){
            System.out.println("yes is equal");
        }

    }





















}
