package com.pratice.DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestStreak {
	public static void main(String args[]) {
		int arr[] = { 1, 9, 3, 10, 4, 20, 2 };
		Arrays.sort(arr);
		List<Integer> list = new ArrayList<>();
		List<Integer> longest = new ArrayList<>();
		int consectiveStreak = 1;
		int longestStreak = 1;
		list.add(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[i - 1] + 1) {
				list.add(arr[i]);
				consectiveStreak++;
			} else {
				if (consectiveStreak > longestStreak) {
					longestStreak = consectiveStreak;
					longest = new ArrayList<>(list);
				}
				list.clear();
				list.add(arr[i]);
				consectiveStreak = 1;
			}
			if (consectiveStreak > longestStreak) {
				longestStreak = consectiveStreak;
				longest = new ArrayList<>(list);
			}
		}
		System.out.println(longest);
		System.out.println(longestStreak);
	}
}
