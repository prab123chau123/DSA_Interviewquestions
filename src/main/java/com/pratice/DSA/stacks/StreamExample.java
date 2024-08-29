package com.pratice.DSA.stacks;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
	public static void main(String args[]) {
		List<Integer> list = Arrays.asList(4, 9, 8, 27, 33, 16, 1, 5);
		list.stream().forEach(e -> {
//			if (e % 2 == 0)
//				System.out.println(e + " " + "A");
//			else if (e % 3 == 0)
//				System.out.println(e + " " + "B");
//			else if (e % 2 != 0 || e % 3 != 0)
//				System.out.println(e + " " + "C");
			if (e % 2 == 0) {
				System.out.printf("%-2d A%n", e);
			} else if (e % 3 == 0) {
				System.out.printf("%-2d B%n", e);
			} else {
				System.out.printf("%-2d C%n", e);
			}
		});
	}
}
