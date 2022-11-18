	import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LargestSubsequenceStringWithMinChars {

	public static void main(String[] args) {
		
		String str = "geeksforgeeks"; 
		
		int k = 2;
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		char ch[] = str.toCharArray();
		 
		for(Character c : ch)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			} 
		}
		
		
		
		
		for(Character c : ch)
		{
			if(map.get(c)>=k)
			{
				System.out.print(c
						);
			}
		}
		
		
		
		System.out.println(str.toUpperCase());
		
	}
}
