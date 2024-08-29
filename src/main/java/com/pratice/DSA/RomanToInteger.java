package com.pratice.DSA;

import java.util.HashMap;

public class RomanToInteger {

	public static void main(String args[]) {
		HashMap<Character, Integer> romanNumber=new HashMap<>();
		romanNumber.put('I',1);
		romanNumber.put('I', 1);
        romanNumber.put('V', 5);
        romanNumber.put('X', 10);
        romanNumber.put('L', 50);
        romanNumber.put('C', 100);
        romanNumber.put('D', 500);
        romanNumber.put('M', 1000);
        String roman="MCMXCIV";
        Integer result=0;
        Integer prevVaue=0;
        for(Character c:roman.toCharArray())
        {
          int currentValue=romanNumber.get(c);
          if(currentValue<prevVaue)
          {
        	  result-=currentValue;
          }
          else {
			result+=currentValue;
		}
          prevVaue=currentValue;
        }
        System.out.println(result);
	}
}
