package com.pratice.DSA.twopointertechnique;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
	public static List<Integer> twoSum(int arr[], int n, int target) {
		Arrays.sort(arr);
		int left = 0;
		int right = n;
		List<Integer> result = new ArrayList<>();
		while (left < right) {
			int sum = arr[left] + arr[right];
			if (sum == target) {
				result.addAll(Arrays.asList(arr[left], arr[right]));
				return result;
			} else if (sum > target)
				right--;
			else {
				left++;
			}
		}
		return result;
	}

	public static int[] twoSumExtraSpace(int[] arr, int n, int target) {
		HashMap<Integer, Integer> result = new HashMap<>();
		for (int a : arr) {
			int compliment = target - a;
			if (result.containsKey(compliment)) {
				return new int[] { compliment, a };
			}
			result.put(a, result.getOrDefault(a, 0) + 1);
		}
		return new int[] {};
	}

	public static void main(String args[]) {
		int arr[] = { 2, 7, 11, 15 };
		int target = 9;
		int n = arr.length - 1;
		System.out.println(twoSum(arr, n, target));
		int result[] = twoSumExtraSpace(arr, n, target);
		for (int r : result)
			System.out.print(r + " ");
	}
}
