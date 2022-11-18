package writingcode;

import java.util.HashMap;
import java.util.Map;

public class Hashmapway {

	public static Map<String, Integer> marksMap;
	
	static
	{
		marksMap = new HashMap<String, Integer>();
		marksMap.put("A", 100);
		marksMap.put("B", 200);
	}
	
	
	public static void main(String[] args) {
		
		//HashMap class
		HashMap<String, String> map1 = new HashMap<String, String>();
		Map<String, String> map2 = new HashMap<String , String>();
		
		//static way : hashmap
		System.out.println(Hashmapway.marksMap.get("A"));
		
	}

}
