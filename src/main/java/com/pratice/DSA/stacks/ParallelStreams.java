package com.pratice.DSA.stacks;

import java.util.Arrays;

public class ParallelStreams {

	public static void main(String args[]) {
		String[] str = { "Prabhat", "Ashutosh", "John", "Alice" };
		Arrays.stream(str).filter(name -> {
			System.out.println("The Paralle stream " + name + " " + Thread.currentThread().getName());
			return name.startsWith("A");
		}).map(String::toUpperCase).forEach(name -> System.out.println(name));
	}
}
