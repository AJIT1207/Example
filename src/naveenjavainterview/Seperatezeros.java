package naveenjavainterview;

import java.util.Arrays;

public class Seperatezeros {

	public static void main(String[] args) {
		// seperating zeros from the list
		
		int arr[] = {12,3,4,5,56,0,5,5,0,0,4};
		int counter=0;
		
		for(int i = 0;i < arr.length; i++)
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
