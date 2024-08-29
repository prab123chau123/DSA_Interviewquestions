package com.pratice.DSA.iqvia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergedTwoSubarray {
	public static void main(String args[]) {
		int array1[] = { 1, 3, 5, 7 };
		int array2[] = { 2, 4, 6, 8 };
		List<Integer> mergedSorted = new ArrayList<>();
		int index1 = 0;
		int index2 = 0;
		while (index1 < array1.length && index2 < array2.length) {
			if (array1[index1] < array2[index2]) {
				mergedSorted.add(array1[index1++]);
			} else {
				mergedSorted.add(array2[index2++]);
			}
		}
		while (index1 < array1.length) {
			mergedSorted.add(array1[index1++]);
		}
		while (index2 < array2.length) {
			mergedSorted.add(array2[index2++]);
		}
		System.out.println(mergedSorted);

		List<Integer> sortedArray = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).sorted().boxed()
				.collect(Collectors.toList());
		System.out.println((sortedArray));
	}
}
