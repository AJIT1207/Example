import java.util.Arrays;

public class ArrayPartion {

	public static void main(String[] args) {


		int nums[] = {1,4,3,2,5,6};
		
		Arrays.sort(nums);
		
		int sum = 0; 
		 
		for(int i = 0; i < nums.length; i+=2)
		{
			sum += nums[i]; 
		}
		 
		System.out.println(sum);  
	}

}
