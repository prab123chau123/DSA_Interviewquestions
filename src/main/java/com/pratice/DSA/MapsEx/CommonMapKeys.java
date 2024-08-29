package com.pratice.DSA.MapsEx;

import java.util.HashMap;
import java.util.Map;

public class CommonMapKeys {
	public static void main(String args[]) {
		Map<String, Integer> map1 = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>();
		map1.put("A", 1);
		map1.put("B", 2);

		map2.put("C", 3);
		map2.put("D", 4);
		map2.put("A", 5);
		map2.put("B", 6);
		
		map1.keySet().stream().filter(map2.keySet()::contains).forEach(e->System.out.print(e+" "));
	}
}
