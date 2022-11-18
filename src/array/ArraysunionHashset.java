package array;

import java.util.Arrays;
import java.util.HashSet;

public class ArraysunionHashset {

	public static void main(String[] args) {

		int a[] = {1,2,3,5};
		int b[] = {4,5};
		
		HashSet set = new HashSet<Integer>();
		
		for(int i : a)
		{
			set.add(i);
		}

		for(int j : b)
		{
			set.add(j);
		}
		
		System.out.println(set);
	}

}
