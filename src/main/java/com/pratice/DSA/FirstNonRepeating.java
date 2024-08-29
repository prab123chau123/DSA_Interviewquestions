package com.pratice.DSA;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstNonRepeating {
	public static void main(String args[]) {
		String str = "loveleetcode";
		HashMap<Character, Integer> map = new LinkedHashMap<>();
		for (Character s : str.toCharArray()) {
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		for (int i = 0; i < map.size(); i++) {
			if (map.get(str.charAt(i)) == 1) {
				System.out.println(str.charAt(i));
				break;
			}
		}
	}
}
