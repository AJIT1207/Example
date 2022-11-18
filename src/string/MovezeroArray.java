package string;

import java.util.Arrays;

public class MovezeroArray {

	public static void main(String[] args) {

		int arr[] = {12, 0, 7, 0, 8, 0, 3};
		
		int counter = 0;
		
		for(int i = 0; i< arr.length ; i++)
		{
			if(arr[i]!= 0)
			{
				arr[counter] = arr[i];
				counter++;
			} 
		}
		
		while(counter < arr.length)
		{
			arr[counter] = 0;
			counter++;
		}
		System.out.println(Arrays.toString(arr));
	}
	}


