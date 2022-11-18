
public class MaxDiffArrayLargerElementFirstAfterSmaller {

	public static void main(String[] args) {
	//	Maximum difference between two elements such that larger element appears after the smaller number = geeksforgeeks
		
		int arr[] = {1, 2, 90, 10, 110};
		
		int max_diff = arr[1] + arr[0];
		
		int max = arr[1]; 
		
		int min  = arr[0]; 
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[j] + arr[i] > max_diff )  // 8 > 1
				{
					max_diff = arr[j] + arr[i];
					
					max = arr[j];
					min = arr[i];  
				}
			}
		}
		
		System.out.println(max);
		System.out.println(min);
		
		System.out.println(max_diff);
	}

}
