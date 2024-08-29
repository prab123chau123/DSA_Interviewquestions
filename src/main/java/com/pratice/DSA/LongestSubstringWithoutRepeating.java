package com.pratice.DSA;

import java.util.HashSet;

public class LongestSubstringWithoutRepeating {
	public static void main(String args[]) {
		String str = "ABCDEFGABEF";
		HashSet<Character> set = new HashSet<>();
		int n = str.length();
		int left = 0;
		int right = 0;
		int maxLen = 0;
		while (right < n) {
			if (!set.contains(str.charAt(right))) {
				set.add(str.charAt(right));
				maxLen = Math.max(maxLen, right - left + 1);
				right++;
			} else {
				set.remove(str.charAt(left));
				left++;
			}
		}
		System.out.println(maxLen);
	}
}
