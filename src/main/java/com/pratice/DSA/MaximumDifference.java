package com.pratice.DSA;

import java.util.Arrays;
import java.util.OptionalInt;

public class MaximumDifference {
	public static void main(String[] args) {
		int[] nums = {2, 3, 10, 6, 4, 8, 1};
		OptionalInt max=Arrays.stream(nums).max();
		OptionalInt min=Arrays.stream(nums).min();
		if(max.isPresent()&&min.isPresent())
			System.out.println(max.getAsInt()-min.getAsInt());
	}
}
