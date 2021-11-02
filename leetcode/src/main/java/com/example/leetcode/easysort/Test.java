package com.example.leetcode.easysort;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;

/**
 * <p>
 *
 * <p>
 *
 * @author EastCool·Lee
 * @date 2020/7/11 下午12:32
 */
public class Test {

    public static void main(String[] args){
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1,3,nums2,3);
        for (int i:nums1){
            System.out.print(i);
        }
    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] tmpNums1 = Arrays.copyOf(nums1,nums1.length);

        //i表示nums1的初始索引,j表示num2的初始索引
        int i= 0,j = 0,k = 0;

        while(i<m && j<n){
            if(tmpNums1[i]<=nums2[j]){
                nums1[k] = tmpNums1[i];
                k++;
                i++;
            } else{
                nums1[k] = nums2[j];
                k++;
                j++;
            }
        }

        while(i<m){
            nums1[k] = tmpNums1[i];
            k++;
            i++;
        }

        while(j<n){
            nums1[k] = nums2[j];
            k++;
            j++;
        }

    }
}
