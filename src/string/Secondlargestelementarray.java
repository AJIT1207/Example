package string;

import java.util.Arrays;
import java.util.Collections;

public class Secondlargestelementarray {

	public static void main(String[] args) {

		int arr[] = {3,4,5,7,1,2,6};
		
		Integer[] what = Arrays.stream( arr ).boxed().toArray( Integer[]::new );
		
		//Arrays.asList(arr);
		
	//	Integer integ = Integer.valueOf(arr);
		
		Arrays.sort(what, Collections.reverseOrder());
		
		System.out.println(arr[arr.length-2]);

	}

}
