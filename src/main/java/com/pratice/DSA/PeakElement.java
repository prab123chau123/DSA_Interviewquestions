package com.pratice.DSA;

public class PeakElement {
	public static void main(String args[]) {
         int array[]= {7, 2, 3, 1,6,2};
         int n=array.length;
         if(array[0]>array[1])
        	 System.out.print(array[0]+" ");
         for(int i=1;i<array.length-1;i++)
         {
        	if(array[i]>array[i-1]&&array[i]>array[i+1])
        	{
        		System.out.print(array[i]+" ");
        	}
         }
         if(array[n-1]>array[n-2])
        	 System.out.print(array[n-1]+" ");
	}
}
