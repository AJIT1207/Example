package collectionsnaveen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Testing123 {

	public static void main(String[] args) {
//
//		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,12,3,5,6));
//		
//		LinkedHashSet<Integer> linkedhashset = new LinkedHashSet<Integer>(numbers);
//		
//		ArrayList<Integer> duplicateremoval = new ArrayList<Integer>(linkedhashset);
//		
//		System.out.println(duplicateremoval);
//		
	
		String str = "Ajit Ajit is java to java for hello for";
		
		List<Object> list = Arrays.asList(str.split(" "));
		
		list.stream().filter(e -> Collections.frequency(list, e)>1).collect(Collectors.toSet()).forEach(System.out::
			print);
		
		
		
			
		
	}

}
