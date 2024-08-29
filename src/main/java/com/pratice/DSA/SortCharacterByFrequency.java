package com.pratice.DSA;
import java.util.HashMap;

import com.pratice.DSA.Model.SortCharacters;


public class SortCharacterByFrequency {

	public static void main(String args[])
	{
	
		SortCharacters sortCharacters=new SortCharacters();
		String str="geeksforgeeks";
		HashMap<Character, Integer> map=new HashMap<>();
		for(char c:str.toCharArray())
		{
			map.put(c, map.getOrDefault(c, 0)+1);
		}
//		System.out.println(map);
		map.entrySet().stream().sorted((a,b)->a.getValue().compareTo(b.getValue()))
		.forEach(entry->sortCharacters.addCharacter(entry.getKey(), entry.getValue()));
		//.forEach(entry->System.out.print(entry.getKey()));
		sortCharacters.printCharacters();
	}
}
