package foxqa;

import java.util.HashMap;

public class Duplichar {

	public static void main(String[] args) {

		String str = "ajit jaiswal";
		
		char ch[] = str.toCharArray();
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
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
		
		for(Character c : map.keySet())
		{
			if(map.get(c)>1)
			{
				System.out.println("Character is " + c + " no of time repeating : " + map.get(c));
			}
		}
		
	
	}

}
