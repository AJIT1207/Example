package string;

import java.util.*;
import java.lang.*;
public class LargestAlphabeticcharinString {

	 // Function to find the Largest Alphabetic Character

    	public static String largestCharacter(String str)
    	{
    		boolean[] uppercase = new boolean[26];
    		boolean[] lowercase = new boolean[26];

    		char[] arr = str.toCharArray();

    		for (char c : arr) {

    			if (Character.isLowerCase(c))
    				lowercase[c-'a'] = true;  
 
    			if (Character.isUpperCase(c))
    				uppercase[c-'A'] = true;
    		}

    		for (int i = 25; i >= 0; i--) {

    			if (uppercase[i] && lowercase[i])
    				return (char)(i + 'A') + "";
    		}

    		return "-1";
    	}

    	public static void main(String[] args)
    	{
    		String str = "abceADE";

    		System.out.println(largestCharacter(str));
    	}
}
