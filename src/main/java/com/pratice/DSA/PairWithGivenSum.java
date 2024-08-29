package com.pratice.DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PairWithGivenSum {
public static void main(String args[]) {
	int[] nums = {2, 7, 11, 15};
    int target = 9;
    findPairs(nums, target);
}

private static void findPairs(int[] nums, int target) {
	HashMap<Integer,Integer> map=new HashMap<>();
	List<Integer> result=new ArrayList<>();
	for(int n:nums) {
		int compliment=target-n;
		if(map.containsKey(compliment))
		{
		   result.addAll(Arrays.asList(compliment,n));
		   break;
		}
		map.put(n,map.getOrDefault(n,0)+1);
	}
	System.out.println(result);
}
}
