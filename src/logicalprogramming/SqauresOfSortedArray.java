package logicalprogramming;

import java.util.Arrays;

public class SqauresOfSortedArray {
	public static void main(String[] args)
    {
        int arr[] = { -6, -3, -1, 2, 4, 5 };
        int n = arr.length;
 
        System.out.println("Before sort ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
 

        // First convert each array elements
        // into its square
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = arr[i] * arr[i];
        }
        // Sort an array using "inbuild sort function"
        // in Arrays class.
        Arrays.sort(arr);
        
        System.out.println("");
        System.out.println("After Sort ");
        for (int i = 0; i < n; i++)
        System.out.print(arr[i] + " ");
	 
	    }	   
}
