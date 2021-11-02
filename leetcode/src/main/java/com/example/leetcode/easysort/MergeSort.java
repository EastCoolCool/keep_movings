package com.example.leetcode.easysort;

/**
 * <p>
 *
 * <p>
 *
 * @author EastCool·Lee
 * @date 2020/7/10 下午4:50
 */
public class MergeSort {


    public static void main(String[] args) {
        //sort();
        int[] arr = {9, 3, 8, 1, 5, 2, 7};
        int[] temp = new int[arr.length];
        guiBingSort(arr, temp, 0, arr.length - 1);

        for (int x : temp) {
            System.out.println(x);
        }

    }

    public static void guiBingSort(int arr[], int[] temp, int start, int end) {

        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;

        guiBingSort(arr, temp, start, mid);
        guiBingSort(arr, temp, mid + 1, end);

        sort(arr, temp, start, mid, mid + 1, end);


    }

    public static void sort(int[] arr, int[] temp, int start1, int end1, int start2, int end2) {
        //int[] arr1 = {1, 3, 5, 7, 9};

        //int[] arr2 = {2, 4, 6, 8};

        //int[] mergeArr = new int[arr1.length + arr2.length];

        /**
         * i代表arr1的索引
         * j代表arr2的索引
         */
        int i = start1, j = start2, k = 0;

        /**
         * 第一次:
         *  k = 1;i = 1 ; j =0;mergeArr[0] = arr1[0] = 1
         * 第二次
         *  k = 2
         *
         *
         */
        while (i <= end1 && j <= end2) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i];
                i++;
            } else {
                temp[k++] = arr[j];
                j++;
            }
        }


        while (i <= end1) {
            temp[k++] = arr[i];
            i++;

        }
        while (j <= end2) {
            temp[k++] = arr[j];
            j++;
        }

        for (int l = 0; l < k; l++) {
            arr[start1 + l] = temp[l];
        }



    }

}
