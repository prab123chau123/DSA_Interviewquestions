package com.pratice.DSA.MapsEx;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMap {

	public static void main(String args[]) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(101, "John");
		map.put(102, "Alice");
		map.put(103, "Zack");
		HashMap<String, Double> salary = new HashMap<>();
		salary.put("John", 89700.90);
		salary.put("Alice", 2167109.00);
		salary.put("Zack", 678110.00);

		List<String> nameList = salary.entrySet().stream().sorted((a, b) -> b.getValue().compareTo(a.getValue()))
				.map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(nameList);

		Map<Integer, String> sortedMap = map.entrySet().stream().sorted((a, b) -> {
			String name1 = a.getValue();
			String name2 = b.getValue();
			Double salary1 = salary.get(name1);
			Double salary2 = salary.get(name2);
			return salary2.compareTo(salary1);
		}).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));
		System.out.println(sortedMap);

		map.entrySet().stream().sorted((a, b) -> {
			String name1 = a.getValue();
			String name2 = b.getValue();
			Double salary1 = salary.get(name1);
			Double salary2 = salary.get(name2);
			return salary2.compareTo(salary1);
		}).forEach(e->System.out.println(e.getKey()+" "+e.getValue()));
	}
}
