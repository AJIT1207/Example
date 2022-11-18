package example;

import java.util.HashMap;
import java.util.Iterator;

public class StringDupli {
	static void duplicateword(String str)
	{
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		String dupliword[] = str.split(" ");
		for(String words : dupliword)
		{
			if(hm.get(words)!= null)
			{
				hm.put(words, hm.get(words)+1);
			}
			else
			{
			hm.put(words, 1);
			}
		}
			Iterator<String> itr = hm.keySet().iterator();
			while(itr.hasNext())
			{
				String temp = itr.next();
				if(hm.get(temp) > 1)
				{
					System.out.println("the word " + temp + "appeared " + hm.get(temp) + " = no of times");
				}
			}
			
		}
			

	static void findduplicharacter(String charact)
	{
		HashMap<Character, Integer> hmp = new HashMap<Character, Integer>();
		for(int i = 0 ; i < charact.length() ; i++)
		{
			char c =charact.charAt(i);
			if(hmp.get(c)!=null)
			{
				hmp.put(c, hmp.get(c)+1);
			}
			else
			{
			hmp.put(c, 1);
			}
		}
		System.out.println(hmp);
	}
	  
	    
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duplicateword("i am am learning java java");
		findduplicharacter("ajijijii");
	}

}
