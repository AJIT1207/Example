package collectionsnaveen;

import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> usermap = new TreeMap<>();
		usermap.put("Paul", 2300);
		usermap.put("Roy", 7800);
		usermap.put("Buttler", 6700);
		usermap.put("Morgan", 400);
		usermap.put("Woakes", 300); 
		usermap.put("Wood", 2200);
		usermap.put("Stokes", 400);
		usermap.put("Hales", 500);
		
		
		usermap.forEach( (k,v) -> System.out.println(" Key = " + k + " Value = " + v) );
}
}