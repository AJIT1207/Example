import java.util.HashMap;
import java.util.Map;

public class LeetcodeDuplicate {


	public  static boolean dupli(int arr[])
	{
		Map<Integer, Integer> map  = new HashMap<Integer, Integer>();
		
		for(Integer i  : arr)
		{
			if(map.containsKey(i))
			{
				map.put(i, map.get(i)+1);
			}
			else
			{
				map.put(i, 1);
			}
		}
		
		for(Integer i : arr) 
		{
			if(map.get(i) >= 2)
			{
				return true;
				//System.out.println("at least one value is duplicated " + i);
			}
		}
		
		return false;

	}
	public static void main(String[] args) {

		int arr[] = {1,2,3,1};
		dupli(arr);
	}

}
