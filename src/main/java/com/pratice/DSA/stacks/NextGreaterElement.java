package com.pratice.DSA.stacks;
import java.util.Stack;

public class NextGreaterElement {
	public static void nextGreaterElement(int arr[])
	{
		int n=arr.length;
		int result[]=new int[n];
		Stack<Integer> stack=new Stack<>();
		for(int i=0;i<n;i++)
		{
			while (!stack.isEmpty() && arr[stack.peek()]<arr[i])
			{
				result[stack.pop()]=arr[i];
			}
			stack.push(i);
		}
		while(!stack.isEmpty())
		{
			result[stack.pop()] = -1;	
		}
		for (Integer i : result) {
			System.out.print(i+" ");	
		}
	}
	public static void main(String args[]) {
		int[] arr = { 4, 5, 2, 25 };
		int[] result = new int[arr.length];
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (arr[i] < arr[j]) {
					result[i] = arr[j];
					break;
				} else {
					result[i] = -1;
				}
			}
		}
		for (int r : result) {
			System.out.print(r + " ");
		}
		System.out.println();
		System.out.println("--");
		nextGreaterElement(arr);
	}
}
