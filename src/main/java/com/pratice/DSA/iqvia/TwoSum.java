package com.pratice.DSA.iqvia;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String args[]) {
		int arr[] = { 2, 7, 11, 15 };
		int target = 9;
		Map<Integer, Integer> map = new HashMap<>();
		for (int a : arr) {
			int compliment = target - a;
			if (map.containsKey(compliment)) {
				System.out.print(compliment + " " + a);
				break;
			}
			map.put(a, map.getOrDefault(a, 0) + 1);
		}
	}
}
