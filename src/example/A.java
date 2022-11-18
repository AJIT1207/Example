package example;

import java.util.HashMap;
import java.util.Set;

//import example.A.A;

public class A { 
	static void duplihashmap(String str)
	{
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char ch[] = str.toCharArray();
		for(char c : ch)
		{
			if(map.get(c)!=null)
			{
				map.put(c,  map.get(c)+1);
			}
			else
			{
			map.put(c, 1);
		}
		}
		Set<Character> set = map.keySet();
		for(Character app : set)
		{
			if(map.get(app)>1)
			{
				System.out.println(app +" no of time repeated = "+ map.get(app));
			}
			else
			{
				System.out.println(app +" no of time non repeated = "+ map.get(app));
			}
		}
	
	}
	
	public static void main(String[] args) 
	{ 
		duplihashmap("ajjitt");

	}
}
