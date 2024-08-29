package com.pratice.DSA;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedArray {
public static void main(String args[]) {
	 int[] nums1 = {1, 3, 5, 7};
     int[] nums2 = {2, 4, 6, 8};
     mergeArray(nums1,nums2);
}

private static void mergeArray(int[] nums1, int[] nums2) {
	int i1=0;
	int i2=0;
	int k=0;
	//int result[]=new int[nums1.length+nums2.length];
	List<Integer> result=new ArrayList<>();
	while(i1<nums1.length&&i2<nums2.length) {
		if(nums1[i1]<nums2[i2]) {
			result.add(nums1[i1]);
			i1++;
		}
		else {
			result.add(nums2[i2]);
			i2++;
		}
	}
	while(i1<nums1.length)
	{
		result.add(nums1[i1]);	
		i1++;
	}
	while(i2<nums2.length)
	{
		result.add(nums2[i2]);
		i2++;
	}
	System.out.println(result);
}
}
