package com.pratice.DSA.stacks;

import java.util.Stack;

public class AreaOfHistogram {

	public static void main(String args[]) {
		int arr[] = { 2, 1, 5, 6, 2, 3 };
		int n = arr.length;
		int maxArea = 0;
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		for (int i = 1; i < n; i++) {
			while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
				int height = arr[stack.pop()];
				int width = stack.isEmpty() ? i : i - stack.peek() - 1;
				maxArea = Math.max(maxArea, width * height);
			}
			stack.push(i);
		}
		while (!stack.isEmpty()) {
			int height = arr[stack.pop()];
			int width = stack.isEmpty() ? n : n - stack.peek() - 1;
			maxArea = Math.max(maxArea, width * height);
		}
		System.out.println(maxArea);
	}
}
