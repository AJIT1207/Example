package foxqa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionOfArrays {
	
	static void union(int[] ... inputarrays) 
	{
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int newarr[] : inputarrays)
		{
			//System.out.println(Arrays.toString(newarr));
			
			for(int j : newarr)
			{
				set.add(j);
			}
		}
		
		System.out.println(set);
		
	}

	public static void main(String[] args) {


		int arr1[] = {1,3,4,5};
		
		int arr2[] = {3,2,1,4};
		
		int arr3[] = {5,1,2,3};
		
		int arr4[] = {1,2,3,4,5,6,7,8};
		
		union(arr1, arr2, arr3, arr4);
		}

	

	}


