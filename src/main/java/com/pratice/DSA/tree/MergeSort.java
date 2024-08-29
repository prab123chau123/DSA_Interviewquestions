package com.pratice.DSA.tree;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

	private static void merge(int[] arr, int start, int middle, int end) {
		int index1 = start;
		int index2 = middle + 1;
		List<Integer> sortedArray = new ArrayList<>();
		while (index1 <= middle && index2 <= end) {
			if (arr[index1] < arr[index2]) {
				sortedArray.add(arr[index1++]);
			} else {
				sortedArray.add(arr[index2++]);
			}
		}
		while (index1 <= middle) {
			sortedArray.add(arr[index1++]);
		}
		while (index2 <= end) {
			sortedArray.add(arr[index2++]);
		}
		for (int i = 0; i < sortedArray.size(); i++) {
			arr[start + i] = sortedArray.get(i);
		}
	}

	public static void mergeSort(int[] arr, int start, int end) {
		if (start < end) {
			int middle = (start + end) / 2;
			mergeSort(arr, start, middle);
			mergeSort(arr, middle + 1, end);
			merge(arr, start, middle, end);
		}
	}

	public static void main(String args[]) {
		int[] arr = { 1, 5, 4, 9, 11, 12, 14, 13, 0, 2 };
		int start = 0;
		int end = arr.length - 1;
		mergeSort(arr, start, end);
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
