package com.pratice.DSA.tree;

import java.util.Arrays;
import java.util.Optional;

public class SecondLargest {
	public static void main(String args[]) {
		int arr[] = { 1, 5, 4, 9, 11, 12, 14, 13 };
		Optional<Integer> secondLargest = Arrays.stream(arr).boxed().sorted((a, b) -> b.compareTo(a)).skip(1)
				.findFirst();
		if (secondLargest.isPresent())
			System.out.println("Second largest element in array " + secondLargest.get());

		int max = 0;
		int secondMax = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];
			}
			if (arr[i] != max && arr[i] > secondMax) {
				secondMax = arr[i];
			}
		}
		System.out.println("Second Max " + secondMax);
	}
}
