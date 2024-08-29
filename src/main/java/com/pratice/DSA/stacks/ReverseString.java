package com.pratice.DSA.stacks;

import java.util.Stack;

public class ReverseString {

	public static void main(String args[]) {
		String string="Hello World";
	    Stack<Character> stack=new Stack<>();
	    for(Character c:string.toCharArray()) {
	    	stack.push(c);
	    }
	    while(!stack.isEmpty()) {
	    	System.out.print(stack.pop());
	    }
	    stack.stream().forEach(e->System.out.print(e));
	}
}
