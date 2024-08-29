package com.pratice.DSA.stacks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 1, 1, 4 }, { 6, 6 }, { 0, 9, 7 } };

		Arrays.stream(arr).flatMapToInt(Arrays::stream).filter(e -> e % 2 == 0).forEach(a -> System.out.print(a + " "));

		System.out.println(); // Print a new line

		Object[] array = { 1, 2, new Object[] { 3, 4, 5, new Object[] { 6, 7, 8, 9 }, 10 }, 11, 12 };
		List<Integer> flatData = flattenMap(array);
		System.out.println(flatData);
		
	}

	private static List<Integer> flattenMap(Object[] array) {
		return Arrays.stream(array).flatMap(element -> {
			if (element instanceof Object[]) {
				return  flattenMap((Object[]) element).stream();
			} else if (element instanceof Integer) {
				return Stream.of((Integer) element);
			} else {
				 Stream.empty();
			}
			return null;
		}).collect(Collectors.toList());
	}
}
