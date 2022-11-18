package logicalprogramming;

import java.util.HashSet;
import java.util.Set;

public class Longest {

	public static void main(String[] args) {
		
		String str1 = "abcp";
		String str2 = "cbaq";
		String str3 = str1 + str2;
		
		char ch[] = str3.toCharArray();
		
		int count = 0;
		
		Set<Character> set = new HashSet<Character>();
		
		for(Character c : ch)
		{
			if(!set.contains(c))
			{
				set.add(c);
				count++;
			}
		}
		
		System.out.println(count);

	}

}
