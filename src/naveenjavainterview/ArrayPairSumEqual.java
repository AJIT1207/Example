package naveenjavainterview;

import java.util.Arrays;

public class ArrayPairSumEqual {

	public static void main(String[] args) {
		// Find All Pairs Of Elements In An Array Whose Sum Is Equal To A Given Number 
		//this logic works in the case of sorted array and will be o(nlogn)
		int arr[] = {4, 6, 5, -10, 8, 5, 20};
		Arrays.sort(arr);
		int sum = 10;
		int first = 0;
		int last  = arr.length-1;
		
		System.out.println("Sum of those two elements are = " + sum);
		
		while(first<last)
		{
			if(arr[first]+arr[last]==sum)
			{ 
				System.out.println(arr[first]+ " + " +arr[last]+" = " +sum );
				first++;
				last--;
			}
			else if(arr[first]+arr[last]<sum)
			{
				first++;
			}
			else if(arr[first]+arr[last]>sum)
			{
				last--;
			}	
		}
		
		
		

	}

}
