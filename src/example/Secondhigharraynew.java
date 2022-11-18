package example;

import java.util.Collections;

public class Secondhigharraynew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,3,4,5};
		int temp;
		for(int i=0;i<arr.length-1;i++)
		{

				if(arr[i]>arr[i+1])
				{
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				} 
			}
		Collections.reverseOrder();
		System.out.println(arr[4]);
	}

}
