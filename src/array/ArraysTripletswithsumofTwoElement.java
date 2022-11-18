package array;

import java.util.HashSet;

public class ArraysTripletswithsumofTwoElement {

	public static void main(String[] args) {
		
		int inputArray[] = {21, 13, 47, 61, 34, 40, 55, 71, 87};
		
		HashSet<Integer> set = new HashSet<Integer>(); 
		
		for(int i = 0; i <inputArray.length; i++)
		{
			set.add(inputArray[i]);
		}
		
		for(int i =0 ; i< inputArray.length-1 ; i++)
		{
			for(int j = 0; j< inputArray.length ; j++)
			{
				if(set.contains(inputArray[i]+ inputArray[j]))
				{
					System.out.println( "["+inputArray[i]+", "+ inputArray[j]+" , " + (inputArray[i] + inputArray[j]) );
				}
			}
		} 
	} 

}
