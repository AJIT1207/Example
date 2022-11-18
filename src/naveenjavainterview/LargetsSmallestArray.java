package naveenjavainterview;

import java.util.Arrays;

public class LargetsSmallestArray {

	public static void main(String[] args) {
		int numbers[] = {4,3,1,2,18,38,38,9};
		
		int largest = numbers[0];
		int snallest = numbers[0];
		
		for(int i = 1;i<numbers.length;i++)
		{
			if(numbers[i]>largest)
			{
				largest = numbers[i];
			}
			else if(numbers[i]<snallest)
			{
				snallest=numbers[i];
			}
		}
		
		System.out.println("Given array is " + Arrays.toString(numbers));
		System.out.println("Smallest number is = " + snallest);
		System.out.println("Largest number is = " + largest);
	}

}
