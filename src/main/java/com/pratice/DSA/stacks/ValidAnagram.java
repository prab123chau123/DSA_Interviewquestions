package com.pratice.DSA.stacks;

import java.util.HashMap;

public class ValidAnagram {

	public static void main(String args[]) {
		String s1 = "cat";
		String s2 = "tac";

		String result = checkValidAnagram(s1, s2);
		System.out.println(result);
	}

	private static String checkValidAnagram(String s1, String s2) {
		HashMap<Character, Integer> map = new HashMap<>();

		if (s1.length() != s2.length())
			return "No";

		for (Character c : s1.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for (int i = 0; i < s2.length(); i++) {
			if (!map.containsKey(s2.charAt(i))) {
				return "No";
			}
			map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i), 0) - 1);
			if(map.get(s2.charAt(i))==0)
				map.remove(s2.charAt(i));
		}
		System.out.println(map);
		return map.isEmpty() ? "YES" : "No";
	}
}
