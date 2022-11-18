package collectionsnaveen;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetConcepts {

	public static void main(String[] args) {
		
		Set<String> hs = new HashSet<String>();
		
		hs.add("A");
		hs.add("value");
		hs.add("A");
		System.out.println(hs);
		
		Set<Integer> first = new HashSet<Integer>();
		first.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6}));
		
		Set<Integer> second = new HashSet<Integer>();
		second.addAll(Arrays.asList(new Integer[] {3,7,8,9,0,11,22}));
		
		Set<Integer> union = new HashSet<Integer>(first);
		union.addAll(second);
		
		System.out.println(union);
		System.out.println();
		
		
		
		
	}

}
