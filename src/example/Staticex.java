package example;

import java.util.HashMap;
import java.util.Set;

public class Staticex {
	
	static void dupliword(String str)
	{
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String aj[] = str.split(" ");
		for(String words: aj)
		{
			if(map.get(words)!=null)
			{
				map.put(words, map.get(words)+1);
			}
			else
			{
			map.put(words, 1);
		}
		}
		 Set<String> dupli  = map.keySet();
		 for(String hello : dupli)
		 {
			 if(map.get(hello)>1)
			 {
				 System.out.println(hello + " repetaetd times = " + map.get(hello));
			 }
		 }
		//System.out.println(map);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dupliword("i am am ajit ajit");

	}

}
