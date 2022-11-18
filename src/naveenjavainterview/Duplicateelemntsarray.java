package naveenjavainterview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Duplicateelemntsarray {

	public static void main(String[] args) {
		
		String names[] = {"Java","Cplus", "C", "Python","Java","C"};
		
		for(int i=0;i<names.length;i++)
		{
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i].equalsIgnoreCase(names[j]))
				{
					System.out.println("Duplicate elements = " + names[i]);
				}
			}
		}
		
		//using HashSet	
		Set<String> store = new HashSet<String>();
		int counter=0;
		for(String name : names)
		{
			if(store.add(name) == false)
			{
				counter++;
				System.out.println("Duplicate element is with counter = " + name + "=" + counter);
			}
		}
		
		//using HashMap
		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		for(String name: names)
		{
			Integer count = storeMap.get(name);
			if(count == null)
			{
				storeMap.put(name, 1);
			}
			else
			{
				storeMap.put(name, ++count);
			}
		}
		
		//get the values from this HashMap
		
		
	}

}
