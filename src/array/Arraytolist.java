package array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Arraytolist {

	public static void main(String[] args) {
		
		String a[] = new String[] {"A", "B", "C", "D", "E"};
		
		System.out.println(Arrays.toString(a));
		
		List<String> list = Arrays.asList(a);
		
		System.out.println(list);
		
	//	System.out.println(a);
		

	}

}
