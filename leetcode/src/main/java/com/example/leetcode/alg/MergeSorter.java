package com.example.leetcode.alg;

import java.util.Arrays;

/**
 * 归并排序
 */
public class MergeSorter{

	public static int[] sort(int[] arr) {
		if(arr == null || arr.length <= 1) {
			return null;
		}
		
		int[] tmp = new int[arr.length];
		return sortHelper(arr, tmp, 0, arr.length-1);
	}
	
	
	// T(n) = 2*T(n/2) + O(n) => O(nlogn) 主定理
	public static int[] sortHelper(int[] arr, int[] tmp, int start, int end) {
		if(start >= end) {
			return null;
		}
		
		int mid = (start + end) / 2;
		
		sortHelper(arr, tmp, start, mid);
		sortHelper(arr, tmp, mid+1, end);
		
		return merge(arr, tmp, start, mid, mid+1, end);
		
	}

	private static int[] merge(int[] arr, int[] tmp, int s1, int e1, int s2, int e2) {

		int i = s1, j = s2, k = 0;
		
		while(i <= e1 && j<= e2) {
			if(arr[i] <= arr[j]) {
				tmp[k++] = arr[i];
				i++;
			}else {
				tmp[k++] = arr[j];
				j++;
			}
		}
		
		while(i <= e1) {
			tmp[k++] = arr[i];
			i++;
		}
		
		while(j <= e2) {
			tmp[k++] = arr[j];
			j++;
		}
		
		for(int l=0; l<k; l++) {
			arr[s1+l] = tmp[l];
		}
		return tmp;
	}
	
	public static void main(String[] args) {

		int[] sort = sort(new int[]{3, 9, 7, 1, 2, 6, 5});
		for(int x : sort){
			System.out.println(x);
		}

		/*int[] arrayToSort = SortUtils.buildRandomIntArray(10);
		SortUtils.printArray(arrayToSort);
		
		int[] arrayClone = Arrays.copyOf(arrayToSort, arrayToSort.length);
		
		Arrays.sort(arrayClone);
		Sorter sorter  = new MergeSorter();
		sorter.sort(arrayToSort);
		SortUtils.printArray(arrayToSort);

		if(SortUtils.isEquals(arrayToSort, arrayClone)) 
		{
			System.out.println("The two array is equal ...");
		}else {
			System.out.println("The two array is not equal ...");
		}*/
	}

}
