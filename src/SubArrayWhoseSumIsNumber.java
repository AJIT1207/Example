import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SubArrayWhoseSumIsNumber {

	public static void main(String[] args) {
		
		int inputarr[] = {42, 15, 12, 8, 6, 32};
		
		int number = 26;
		
		System.out.println(Arrays.toString(twosum(inputarr, number)));
		
	}
	public static int[] twosum(int inputarr[], int number)
	{
		
		int result[] = new int[3];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0 ; i < inputarr.length; i++)
		{
			if(map.containsKey(number - inputarr[i]))
			{
				result[1] = i;
				result[0] = map.get(number - inputarr[i]);
				return result;
			}
			
			map.put(inputarr[i], i);
		}
		
		return result;

	}

}



//int start = 0;
//
//int sum = inputarr[0]; // 42
// 
//for(int i = 1; i < inputarr.length; i++)
//{
//	sum = sum + inputarr[i];  //42+15
//
//	while(sum > number && start <= i-1 )   //42+15 >  0 <=0
//	{
//		sum = sum - inputarr[start];   // 42+15  - 42
//		
//		start++;
//	}
//	
//	if(sum == number)
//	{
//		
//		System.out.println("continous sub array of ");
//		
//		for(int j = start; j<= i; j++)
//		{
//			System.out.print(inputarr[j]+" ");
//		}
//		
//		
//	}
//}
//

