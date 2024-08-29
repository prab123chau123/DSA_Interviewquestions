package com.pratice.DSA;

import java.util.PriorityQueue;

public class KthSmallest {
public static void main(String args[]) {
	int[] nums = {7, 10, 4, 3, 20, 15};
    int k = 3;
    PriorityQueue<Integer> pQueue=new PriorityQueue<>((a,b)->b-a);
    for(int n:nums) {
    	pQueue.offer(n);
    	if(pQueue.size()>k) {
    		pQueue.poll();
    	}
    }
    System.out.println(pQueue.peek());
}
}
