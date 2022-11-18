package naveenautomation;

import java.util.HashMap;

public class Stringduplimap {

	public static void deupli(String str)
	{
		String newstr[] = str.split(" ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(String words : newstr)
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
		//using Lambda expression
		map.forEach((k,v) -> System.out.println("Key =" + k + "Value = " + v));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			deupli("Java ajit Java am");
	}

}
