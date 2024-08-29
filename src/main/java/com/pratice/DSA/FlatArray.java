package com.pratice.DSA;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FlatArray {
	public static void main(String args[]) {
		
		CollectFlatData<Integer> collect=new CollectFlatData<>();
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
		List<Integer> flatData = Arrays.stream(arr).flatMapToInt(IntStream::of).boxed().collect(Collectors.toList());
		System.out.println(flatData);

		List<List<Integer>> list = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6),Arrays.asList(7, 8, 9));
		
        List<Integer> result=list.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(result);
        
        list.stream().flatMap(List::stream).forEach(a->System.out.print(a+" "));
        
        System.out.println();
        list.stream().flatMap(List::stream).forEach(a->collect.collectData(a));
        collect.traverseData();
	}
}
