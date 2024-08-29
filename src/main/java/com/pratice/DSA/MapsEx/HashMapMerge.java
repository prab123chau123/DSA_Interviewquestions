package com.pratice.DSA.MapsEx;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapMerge {

	public static void main(String args[]) {
		Map<String, Integer> map1 = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>();
		map1.put("A", 1);
		map1.put("B", 2);

		map2.put("C", 3);
		map2.put("D", 4);

		Map<String, Integer> mergeMap = Stream.concat(map1.entrySet().stream(), map2.entrySet().stream())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a + b));
		System.out.println(mergeMap);
	}
}
