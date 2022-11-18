package collectionsnaveen;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSync {

	public static void main(String[] args) {
		
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("1", "Java");
		map1.put("2", "Python");
		map1.put("3", "C++");
		
		//create ynchronizedMap
		
		Map<String, String> synchMap = Collections.synchronizedMap(map1);
		System.out.println(synchMap);
		
		//ConcurrentHashMap
		
		ConcurrentHashMap<String, String> concurrentmap = new ConcurrentHashMap<String, String>();
		concurrentmap.put("A", "Java");
		concurrentmap.put("B", "Python");
		concurrentmap.put("C", "C++");
		
		System.out.println(concurrentmap.get("A"));
		

	}

}
