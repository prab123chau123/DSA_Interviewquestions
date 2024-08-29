package com.pratice.DSA.iqvia;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MoveZerosEnd {
	public static void main(String args[]) {
		int arr[] = { 0, 1, 0, 3, 12 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				arr[count++] = arr[i];
			}
		}
		if (count < arr.length) {
			for (int i = count; i < arr.length; i++) {
				arr[i] = 0;
			}
		}
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		Arrays.stream(arr).boxed().forEach(e -> System.out.print(e + " "));

		List<Integer> result = List.of(2, 4, 6, 9, 10);
		boolean allEven = result.stream().allMatch(e -> e % 2 == 0);
		System.out.println(allEven);

		List<String> list = Arrays.asList("java", "hello", "prabhat", "aman");
		List<String> getdataList = list.stream().peek(System.out::println)
				.map(e -> e.substring(0, 1).toUpperCase() + e.substring(1).toLowerCase()).collect(Collectors.toList());
		System.out.println(getdataList);

		List<String> data = List.of("1", "2", "12", "65", "11", "a");

		Set<Integer> parsedData = data.stream().map(e -> {
			try {
				return Integer.parseInt(e);
			} catch (Exception e2) {
				e2.printStackTrace();
				return null;
			}
		}).filter(Objects::nonNull).collect(Collectors.toSet());

		System.out.println(parsedData);

		List<String> items = Arrays.asList("apple", "banana", "orange", "apple", "banana");
		Map<String, Long> map = items.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
	}
}
