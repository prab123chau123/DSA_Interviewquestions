package com.pratice.DSA.twopointertechnique;

import java.util.Arrays;
import java.util.HashSet;

public class SubarraySumZero {
	public static boolean hasSubarraySumZero(int arr[], int n) {
		HashSet<Integer> set = new HashSet<>();
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (sum == 0 || set.contains(sum)) {
				return true;
			}
			set.add(sum);
		}
		return false;
	}

	public static boolean hasSubarraySumZeroNoSpace(int arr[], int n) {
		Arrays.sort(arr);
		int sum = 0;
		for (int a : arr) {
			sum += a;
			if (sum == 0)
				return true;
		}
		return false;
	}

	public static void main(String args[]) {
		int arr[] = { -3, 2, 3, 1, 6 };
		int arr1[]= {-3, 2, 3, 1, 6};
		int n = arr.length;
		System.out.println(hasSubarraySumZero(arr, n));
		System.out.println(hasSubarraySumZeroNoSpace(arr1, arr1.length));
	}
}
