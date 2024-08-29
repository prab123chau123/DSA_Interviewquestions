package com.pratice.DSA.Interview;

import java.util.ArrayList;
import java.util.List;

public class SmallestSubarraySum {
	public static void main(String arg[]) {
		int[] arr = { 1, 4, 45, 6, 10, 19 };
		int x = 51;
		int n = arr.length;
		int maxLen = n + 1;
		int start = 0;
		int end = 0;
		int currSum = 0;
		List<Integer> maxSubarray = null;
		while (end < n) {
			while (currSum <= x && end < n) {
				Integer sum = arr[end++];
				currSum += sum;
			}
			while (currSum > x && start < n) {
				if (end - start < maxLen) {
					maxLen = end - start;
					maxSubarray = new ArrayList<>();
					for (int i = start; i < end; i++) {
						maxSubarray.add(arr[i]);
					}
				}
				currSum -= arr[start++];
			}
		}
		System.out.println(maxSubarray);
		System.out.println(maxLen);
	}
}
