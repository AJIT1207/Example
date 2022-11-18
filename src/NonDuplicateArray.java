import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class NonDuplicateArray {

	public static void main(String[] args) {

		int arr[] = {5,2,3,2,3,1};
		
		int result = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			result  = result ^ arr[i];
		}
		
		System.out.println(result); 
		
//		Set<Integer> set = new HashSet<Integer>();
//		
//		
//		for(Integer i : arr)
//		{
//			if(set.add(i)==false)
//			{
//				System.out.println(i);
//			}
//		}
		
//		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
//		
//		for(Integer i : arr)
//		{
//			if(map.containsKey(i))
//			{
//				map.put(i, map.get(i)+1);
//			}
//			else
//			{
//				map.put(i, 1);
//			}
//		}
//		
//		for(Map.Entry<Integer, Integer> entry : map.entrySet())
//		
//		{
//			int key = entry.getKey();
//			int value = entry.getValue();
//			
//			if(value == 1)
//			{
//				System.out.println(key);
//			}
//		}

	}

}
