package datastructure;

public class BinarySearch {

	public static void main(String[] args) {

		int arr[] = {7,6,5,4,3,2,1};

		int left = 0;  

		int right = arr.length-1; 

		int element = 5;  

		boolean isAsc = arr[left] < arr[right];  

		int mid = 0;

		while(left <= right)
		{ 
			mid = left + (right-left)/2;

			if(element == arr[mid])
			{
				System.out.println(mid);
				break;
			}
			if(isAsc)
			{
				if(element > arr[mid])
				{
					left = mid + 1;
				} 
				else  if(element  < arr[mid])	
				{
					right = mid-1;
				}
			}
			else
			{
				if(element < arr[mid])
				{
					left = mid + 1; 
				}
				else if(element > arr[mid])
				{
					right = mid-1;
				}	
			} 
		}

	} 

}
