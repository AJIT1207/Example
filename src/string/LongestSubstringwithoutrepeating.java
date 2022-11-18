package string;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstringwithoutrepeating {

	public static void main(String[] args) {


		String str = "abbac";
		
		String longestsubstring = null;
		int longestsubstringlength = 0;
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		char arr[] = str.toCharArray();
		 
		for(int i =0 ; i< arr.length ; i++)
		{
			
			char ch = arr[i];
			if(!map.containsKey(ch))   // b - 2, a  
			{
				map.put(ch, i);
			}
			else
			{
				i = map.get(ch);
				map.clear();
			} 
		}
		
		if(map.size() > longestsubstringlength)
		{
			longestsubstringlength  = map.size();
			longestsubstring = map.keySet().toString();
		}
		
		System.out.println(longestsubstring);
		System.out.println(longestsubstringlength);

	}

}
