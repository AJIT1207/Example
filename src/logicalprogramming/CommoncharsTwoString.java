package logicalprogramming;

import java.util.Arrays;
import java.util.*;
import java.util.TreeSet;

public class CommoncharsTwoString {

	public static void main(String[] args) {

		String str1 =  "ajit jai";
		String str2 =  "jaiswa l";
		
		char ch1[] = str1.replaceAll("\\s","").toCharArray();
		char ch2[] = str2.replaceAll("\\s","").toCharArray();
		
		Set<Character> set1 = new HashSet<Character>();
		Set<Character> set2 = new HashSet<Character>();
		
		for(Character c : ch1)
		{  
			set1.add(c);
		}
		
		for(char c : ch2)
		{
			set2.add(c);
		}
		
		set1.addAll(set2);
		
		System.out.println(set1);
		
		 
	}

}
