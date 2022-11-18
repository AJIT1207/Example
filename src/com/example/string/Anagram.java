package com.example.string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isanagram("ajit","tijaws");
	}

	public static void isanagram(String string1, String string2) {
		// TODO Auto-generated method stub
		String str1 = string1.replaceAll("\\s", "");
		String str2 = string2.replaceAll("\\s", "");
		
		boolean status = true;
		if(str1.length()!=str2.length())
		{
			status = false;
		}
		else
		{
		char arr1[] = str1.toLowerCase().toCharArray();
		char arr2[] = str2.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		status = Arrays.equals(arr1, arr2);
		}
		if(status)
		{
			System.out.println(str1 + " and " + str2 + " both are anagram string" );
		}
		else
		{
			System.out.println(str1 + " and " + str2 + " both are not anagram string" );
		}
		
		
	}

}
