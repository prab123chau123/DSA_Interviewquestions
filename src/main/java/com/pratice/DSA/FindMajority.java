package com.pratice.DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FindMajority {
	public static void main(String args[]) {
		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
		Optional<Integer> max = map.entrySet().stream().max((a, b) -> a.getValue().compareTo(b.getValue()))
				.map(Map.Entry::getKey);
		if (max.isPresent())
			System.out.println(max.get());
	}
}
