package sortingalgorithm;

public class SelectionSort {
//Kunal kushwaha  best case - O(n2) and worst case also o(n2)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int arr[] = {2,3,1,4,5};
		
		for(int i=0; i<arr.length-1 ;i++)
		{
			//find the max/min item in the remaining array
			int min = i;  //considering ascending order 
			
			for(int j = i+1 ;j< arr.length; j++)
			{ 
				if(arr[j] < arr[min])
					min = 	j;
				
				 // Swap the found minimum element with the first
	            // element
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i]  = temp;
			}		
			
		}
		

		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		
	}

}
