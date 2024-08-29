package com.pratice.DSA.stacks;

import java.util.Stack;

public class ReverseStack {

	public static void main(String args[]) {
		Stack<Integer> stack = new Stack<>();

		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);

		reverseStack(stack);
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
	}

	private static void reverseStack(Stack<Integer> stack) {
		if (stack.isEmpty()) {
			return;
		}
		int top = stack.pop();
		reverseStack(stack);
		PushAtBottom(stack, top);
	}

	private static void PushAtBottom(Stack<Integer> stack, int top) {
		if (stack.isEmpty()) {
			stack.push(top);
			return;
		}
		int data = stack.pop();
		PushAtBottom(stack, top);
		stack.push(data);
	}
}
