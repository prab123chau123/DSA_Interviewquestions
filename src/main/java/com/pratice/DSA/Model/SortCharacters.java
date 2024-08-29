package com.pratice.DSA.Model;

import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@Builder
@Getter
@Setter
public class SortCharacters {
	HashMap<Character, Integer> map;
	public SortCharacters()
	{
		map=new HashMap<>();
	}
	
	public void addCharacter(Character key,Integer value)
	{
		map.put(key, value);
	}
	public void printCharacters()
	{
		for(Map.Entry<Character,Integer> m:map.entrySet())
		{
			System.out.print(m.getKey());
		}
	}
}
