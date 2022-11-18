package array;

import java.util.ArrayList;
import java.util.List;

import javax.crypto.spec.PSource;

public class Movenegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,-6,4,-8,7,-10};
		/*
		int n = arr.length;
		movenegativearray(arr, n);
		
		for(int i : arr)
		{
			System.out.print(i + " ");
		}
	}

	private static void movenegativearray(int[] arr, int n) {
		// TODO Auto-generated method stub
		int temp[] = new int[n];
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=0)
			{
				temp[j++] = arr[i];
			}
		}
		if (j==n || j==0)
			return;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				temp[j++] = arr[i];
			}
		}
		
		for(int i=0;i<temp.length;i++)
		{
			arr[i] = temp[i];
		}
	}
	*/
	List<Integer> positive =  new ArrayList<Integer>();
	List<Integer> negative =  new ArrayList<Integer>();
	
	for(int data : arr)
	{
		if(data>=0)
		{
			positive.add(data);
		}
		else
		{
			negative.add(data);
		}
	}
	 
	positive.addAll(negative); 
	System.out.println(positive);
	
	}
	
}
