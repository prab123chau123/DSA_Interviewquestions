package com.pratice.DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class CollectOddNo {

	public static void main(String args[]) {
		List<Integer> collectOdd = new ArrayList<>();
		List<Integer> data = new ArrayList<>();
		for (int i = 50; i <= 100; i++) {
			data.add(i);
		}

		System.out.println();

		collectOdd = data.stream().filter(e -> e % 2 != 0).collect(Collectors.toList());
		System.out.println(collectOdd);

		data.stream().filter(e -> e % 2 != 0).forEach(System.out::println);

		IntStream.range(50, 100).filter(e -> e % 2 != 0).forEach(System.out::println);

		int arr[] = { 1, 2, 2, 1, 2, 1, 3, 3, 1, 9, 8, 8, 1, 3, 4 };
		Map<Integer, Long> map = Arrays.stream(arr).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(map);

		Map<Boolean, List<Integer>> map2 = Arrays.stream(arr).boxed()
				.collect(Collectors.partitioningBy(n -> n % 2 == 0));

		System.out.println(map2);

		map.entrySet().stream().sorted((a, b) -> a.getValue().compareTo(b.getValue()))
				.forEach(e -> System.out.print(e.getKey()+" "));
	}
}
