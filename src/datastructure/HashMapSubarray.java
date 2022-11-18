package datastructure;

import java.util.HashMap;

public class HashMapSubarray {

	public static void main(String[] args) {
		
		int arr[] = {10,15,-5, 15, -10, 5};	
		int start = 0;
		int end = -1;
		
		int sum = 5;
		int currentsum=0;
		 
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			currentsum = currentsum + arr[i];
			if(currentsum-sum==0)
			{
				start=0;
				end=i;
				break;
			}
			
			if(map.containsKey(currentsum-sum))
			{
				start = map.get(currentsum-sum) + 1;
				end = i;
				break;
			}
		}
		
		if(end==-1)
		{
			System.out.println("not found");
		}
		else
		{
			System.out.println(start + " " + end);
		}
		
		
	}

}
