package foxqa;

import java.util.Arrays;

public class Arrayleftrotateoneelement {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5};
		
		int size = arr.length;  //5
		//left rotate by 1 element
//		int first = arr[0];  //1
//		
//		for(int i = 0; i<size-1;i++)
//		{
//			arr[i] = arr[i+1];
//		}
//		
//		arr[size-1] = first;
		
		
		//right roatet array by 1 element
		int last = arr[size-1]; //5
		
		for(int i=size-1;i>0;i--)
		{
			arr[i] = arr[i-1];
		} 
		
		arr[0] = last;
		System.out.println("after rotating array left = " + Arrays.toString(arr));
	}

}
