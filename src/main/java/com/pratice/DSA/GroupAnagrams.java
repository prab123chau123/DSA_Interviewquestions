package com.pratice.DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	public static void main(String args[]) {
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		HashMap<String, List<String>> map = new HashMap<>();
		for (int i = 0; i < strs.length; i++) {
			String word = strs[i];
			char[] letters = word.toCharArray();
			Arrays.sort(letters);
			String newWord = new String(letters);
			if (map.containsKey(newWord)) {
				map.get(newWord).add(word);
			} else {
				List<String> list = new ArrayList<>();
				list.add(word);
				map.put(newWord, list);
			}
		}
		System.out.println(map);
		for (Map.Entry<String, List<String>> m : map.entrySet()) {
			for (String s : m.getValue()) {
				System.out.print(s + " ");
			}
		}
	}
}
