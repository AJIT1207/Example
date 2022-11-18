package datastructure;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SynchronizedHashMap {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("1", "hello");
		map.put("2", "Java");
		map.put("3", "world");
		
		System.out.println(map);
		
		//synchronized hashMap  -  thread safe and null key and values allowed
		Map<String, String> synchMap = 	Collections.synchronizedMap(map);
		System.out.println(synchMap);
		
		
		//COncurrentHashMap : it does not throw any concurrentModifcationException
		
		ConcurrentHashMap<String, String> conHashMap = new ConcurrentHashMap<String, String>();
		
		conHashMap.put("1", "hello");
		conHashMap.put("2", "Java");
		conHashMap.put("3", "world");
		
		System.out.println(conHashMap.get(1));
		
		
		

	}

}
