import java.util.Arrays;

public class MinimumabsolutediffinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5, 8, 4, 2, 9, 0};  // 0,2,4,5,8,9 
		
		Arrays.sort(arr);
		
		int first = arr[0];
		
		int second = arr[1];
		
		int min = Math.abs(arr[0] - arr[1]);
		
		for(int i = 2; i< arr.length; i++)
		{  
			if(Math.abs(arr[i] - arr[i-1]) < min)
			{
				min = Math.abs(arr[i] - arr[i-1]); 
				first = arr[i];
				second = arr[i-1];
			}
		}
		System.out.println(first);
		System.out.println(second);
		
		System.out.println(min);
	}

}
