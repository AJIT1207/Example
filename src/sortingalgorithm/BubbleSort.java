package sortingalgorithm;

public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[] = {2,3,1,5,4};
		
		for(int i = 0;i<arr.length-1;i++)
		{
			boolean isSorted = false;   //if arr is already sorted . time complexity is O(n^2) 
			for(int j=0;j<arr.length-1-i;j++)  //space complexity is O(1) and worst case algo is O(n2), best case O(n)
			{
				
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] =  arr[j+1];
					arr[j+1] = temp;
					isSorted=true;
				}
			}
			if(!isSorted)
				break;
		}
		for(int k=0;k<arr.length;k++)
		{
		System.out.println(arr[k]);
		}

	}

}
