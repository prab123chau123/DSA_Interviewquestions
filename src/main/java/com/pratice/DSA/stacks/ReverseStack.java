package com.pratice.DSA.stacks;

import java.util.Arrays;
import java.util.Map;
import java.util.Stack;

public class ReverseStack {

	public static void main(String args[]) {
		Stack<Integer> stack = new Stack<>();
		System.out.println(stack);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
//		while(!stack.isEmpty())
//		{
//        System.out.print(stack.pop()+" ");
//		}
		System.out.println();
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
		System.out.println(top);
		reverseStack(stack);
		PushAtBottom(stack, top);
	}

	private static void PushAtBottom(Stack<Integer> stack, int top) {
		if (stack.isEmpty()) {
			stack.push(top);
			return;
		}
		int data = stack.pop();
		System.out.print(data+" ");
		PushAtBottom(stack, top);
		stack.push(data);
	}
}
