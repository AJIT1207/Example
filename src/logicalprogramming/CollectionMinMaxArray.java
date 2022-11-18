package logicalprogramming;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import example.ArrayList;

public class CollectionMinMaxArray {

	public static void main(String[] args) {

		Integer arr[] = {1,2,3,4,5};
		
		int a[] =  {1,2,3,5,5};
		
		Integer[] newArray = new Integer[a.length];
		
		
		for(int i = 0; i < a.length; i++)
		{
			newArray[i] = Integer.valueOf(a[i]);
		}
		 
//		for(int j = 0 ; j < newArray.length; j++)
//		{			
//			System.out.println(newArray[j]);
//		}
		 
		
		
		int x = Collections.min(Arrays.asList(newArray));  
		System.out.println(x);
		
		int min = Collections.min(Arrays.asList(arr));
		
		int max  = Collections.max(Arrays.asList(arr));
		
		System.out.println(min + " " + max);

	}

}
