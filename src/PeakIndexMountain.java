
public class PeakIndexMountain {

	public static void main(String[] args) {

		int arr[] = {0,1,2,0};
		
		int left = 0;
		int right = arr.length-1;
		
		
		
		while(left < right) 
		{
			int mid = left + (right-left)/2;
			if(arr[mid] < arr[mid+1])
			{
				left = mid + 1;
			}  
			else
			{
				right = mid; 
			}
		}
		
		 System.out.println(right);
	}

}
