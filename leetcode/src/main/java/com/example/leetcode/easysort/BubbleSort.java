package com.example.leetcode.easysort;

/**
 * <p>
 * 冒泡排序
 * <p>
 *
 * @Author EastCool·Lee
 * @Date 2020/6/16 下午7:55
 */
public class BubbleSort {

    public static void main(String[] args) {

        /**
         * 冒泡排序 从小到大
         */
        int[] arr = {6, 4, 1, 2, 7, 3};

        int len = arr.length;
        /**
         * 循环没进说明已经是排好的数组
         */
        for (int x = 0; x < len - 1; x++) {
            Boolean flag = false;
            for (int y = x + 1; y < len; y++) {
                if (arr[x] > arr[y]) {
                    int temp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = temp;
                    flag = true;
                }
            }
            if (!flag) break;
        }
        printArr(arr);

    }

    public static void printArr(int[] arr) {
        for (int x : arr) {
            System.out.println(x);
        }
    }


    public static void mains(String[] args) {


        int[] arr = {6, 4, 1, 2, 7, 3};
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {

            for (int j = i + 1; j < len; j++) {

                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        printArr(arr);


    }


}
