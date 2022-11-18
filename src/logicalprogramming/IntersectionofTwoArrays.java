package logicalprogramming;

import java.util.HashSet;
import java.util.Set;

public class IntersectionofTwoArrays {

	public static void main(String[] args) {

		String str1 = "ajit";
		String str2 = "kumar";
		String str3 = "jaiswal";
		
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		char arr3[] = str3.toCharArray();
		
//		int arr1[] = {1,2,4,4,5,6};
//		
//		int arr2[] = {4,5,6,7,8,9};
//		
//		int arr3[] = {2,3,4,5,6,10};
		
		Set<Character> set1 = new HashSet<Character>();
		
		Set<Character> set2 = new HashSet<Character>();
		
		Set<Character> set3 = new HashSet<Character>();
		
		for(Character i : arr1)
		{
			set1.add(i);
		}
		
		for(Character i : arr2)
		{
			set2.add(i);
		}
		
		for(Character i : arr3)
		{
			set3.add(i);
		}
		
		set1.retainAll(set2);
		
		set1.retainAll(set3);
		
//		for(int i = 0; i< arr1.length; i++)
//		{
//			for(int j = 0; j< arr2.length; j++)
//			{
//				if(arr1[i]==arr2[j])
//				{
//					set.add(arr1[i]);
//				}
//			}
//		}
		
		System.out.println(set1);
		

	}

}
