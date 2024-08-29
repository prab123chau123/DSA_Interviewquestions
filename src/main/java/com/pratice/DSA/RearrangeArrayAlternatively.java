package com.pratice.DSA;

public class RearrangeArrayAlternatively {
	public static void main(String args[]) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		rearrange(arr);
	}

	private static void rearrange(int[] arr) {
       int result[]=new int[arr.length];
       boolean flag=true;
       int low=0;
       int high=arr.length-1;
       for(int i=0;i<arr.length;i++) {
    	   if(flag)
    		   result[i]=arr[high--];
    	   else {
			result[i]=arr[low++];
		}
    	   flag=!flag;
       }
       for(int i:result)
    	   System.out.print(i+" ");
	}
}
