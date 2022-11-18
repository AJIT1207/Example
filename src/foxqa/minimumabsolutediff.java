package foxqa;

import java.util.Arrays;

public class minimumabsolutediff {

	public static void main(String[] args) {
		 
		int[] inputArray = {5, 8, 4, 2, 9, 0};
		
		Arrays.sort(inputArray);
		
		int minimum = Math.abs(inputArray[1]-inputArray[0]);
		
		int first = inputArray[0];
		
		int second = inputArray[1];
		
		for(int i = 2 ; i < inputArray.length ;  i++)
		{
			minimum = Math.abs(inputArray[i] - inputArray[i-1]);
			
			first = inputArray[i-1];
			
			second  = inputArray[i];
		}
		
		System.out.println("("+first+" , "+second+")");
		System.out.println(minimum);
	}

}
