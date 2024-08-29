package com.pratice.DSA.tree;

public class BinarySearch {

	public static int binarySearch(int arr[], int target) {
		int low = 0;
		int high = arr.length - 1;
		while (low < high) {
			int middle = low + (high - low) / 2;

			if (arr[middle] == target)
				return middle;
			else if (arr[middle] < target)
				low = middle + 1;
			else {
				high = middle - 1;
			}
		}
		return -1;
	}

	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(binarySearch(arr, 3));
	}
}
