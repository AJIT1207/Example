package example;

import java.util.HashSet;
import java.util.Set;

public class Duplicateelementarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1,2,3,4,4,4,5,5,5,6};
		/*
		 * for(int i=0;i<arr1.length;i++) { for(int j=i+1;j<arr1.length;j++) {
		 * if(arr1[i]==arr1[j]) { System.out.println("Duplicate elements in array = " +
		 * arr1[i]); } } }
		 */
		
		//using Set
		
		Set<Integer> set = new HashSet();
		for(Integer integer : arr1)
		{
			if(set.add(integer)==false)
			{
				System.out.println("duplicate elements are in array = " + integer);
			}
		}
	}

}
