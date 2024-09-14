package com.pratice.DSA.stacks;

import java.util.Stack;

public class ValidParenthis {

	public static void main(String args[])

	{
		String string = "([]";

		System.out.println(validParenthis(string));
	}

	private static boolean validParenthis(String string) {

		Stack<Character> stack = new Stack<>();

		for (Character c : string.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else if (c == ')' || c == '}' || c == ']') {
				if (stack.isEmpty()) {
					return false;
				}
				int top = stack.pop();

				if ((c == ')' && top != '(') && (c == '}' && top != '{') && (c == ']' && top != '['))
					return false;
			}
		}

		return stack.isEmpty();
	}
}
