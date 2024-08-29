package com.pratice.DSA;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectOddNo {

	public static void main(String args[]) {
		List<Integer> collectOdd=new ArrayList<>();
		List<Integer> data=new ArrayList<>();
		for(int i=50;i<=100;i++) {
			data.add(i);
		}
		//collectOdd=data.stream().filter(e->e%2!=0).collect(Collectors.toList());
		//System.out.println(collectOdd);
		data.stream().
		filter(e->e%2!=0).forEach(System.out::println);
		
		IntStream.range(50,100).filter(e->e%2!=0).forEach(System.out::println);
	}
}
