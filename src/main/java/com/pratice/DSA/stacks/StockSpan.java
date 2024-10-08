package com.pratice.DSA.stacks;

import java.util.Stack;

public class StockSpan {

	public static int[] stockSpan(int[] prices) {
		int span[] = new int[prices.length];

		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < prices.length; i++) {
			while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
				stack.pop();
			}
//			span[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
			if (stack.isEmpty()) {
				span[i] = i + 1;
			} else {
				span[i] = i - stack.peek();
			}
			stack.push(i);
		}
		return span;
	}

	public static void main(String args[]) {
		int[] prices = { 100, 80, 60, 70, 60, 75, 85 };
		int span[] = stockSpan(prices);
		for (int s : span) {
			System.out.print(s + " ");
		}
	}
}
