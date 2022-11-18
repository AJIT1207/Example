import java.util.Arrays;

public class MaxDiffArray {

	public static void main(String[] args) {

		int arr[] = { 2, 1, 5, 3 };
		
		Arrays.sort(arr);
		
		int min = arr[0];
		
		int max  = arr[1];
		 
		int result = 0; 
		
		for(int i = 0; i< arr.length; i++)
		{
			min = Math.min(min,arr[i]);
			max = Math.max(max,arr[i]); 
		}
		
		result  = max - min; 
		
		System.out.println(result);
		System.out.println(max);
		System.out.println(min);

	}

}
