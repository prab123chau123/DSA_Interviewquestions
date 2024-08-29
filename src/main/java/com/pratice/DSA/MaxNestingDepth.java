package com.pratice.DSA;

public class MaxNestingDepth {

	public static void main(String args[])
	{
		String str="(1+(2*3)+((8)/4))+1";
		System.out.println(countMaxDepth(str));
	}

	private static int countMaxDepth(String str) {
		
		int currentDepth=0;
		int maxDepth=0;
		for(Character c:str.toCharArray())
		{
			if(c.equals('('))
			{
				currentDepth++;
				maxDepth=Math.max(maxDepth, currentDepth);
			}
			else if(c.equals(')')){
				currentDepth--;
			}
		}
		return maxDepth;
	}
}
