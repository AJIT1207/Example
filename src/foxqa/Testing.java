package foxqa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Testing {

	public static void main(String[] args) {
		
		String str = "ajit jaiswal";
		
		char arr[]  = str.toCharArray();
		
		HashMap<Character, Integer> map  = new HashMap<Character, Integer>();
		
		for (Character c : arr) 
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
		
		for (Character c : map.keySet()) {
			if(map.get(c)>1)
			{
			System.out.println(c + " count " + map.get(c));
		}
		}
	}
}
