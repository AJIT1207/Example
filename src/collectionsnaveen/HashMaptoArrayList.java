package collectionsnaveen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class HashMaptoArrayList {

	public static void main(String[] args) {
		
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("Accenture",1000);
		map1.put("Wells Fargo",5000);
		map1.put("VMware",10000);
		map1.put("Walmart",5000);
		map1.put("Amazon",11000); 
		
		System.out.println("Company Size = " + map1.size());
		
		Iterator itr = map1.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Map.Entry pairs = (Entry) itr.next();
			System.out.println(pairs.getKey() + " = " + pairs.getValue());
		}
		
		//convert hasmap keys tinto ArrayList
		
		List<String> compNameList = new ArrayList<String>(map1.keySet());
		System.out.println(compNameList);
		for(String t : compNameList)
		{
			System.out.println(t);
		}
		
		
	
		
		
		
}
}