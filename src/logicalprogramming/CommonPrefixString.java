package logicalprogramming;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class CommonPrefixString {

	public static void main(String[] args) {

	String	arr[] = { "grace", "graceful",
            "ungraceful","gracefully" };
	
	int size = arr.length;
	
	if(size == 0)
		System.out.println("empty");
	 
	if(size == 1)
		System.out.println(arr[0]);
	
	Arrays.sort(arr); 
	//find the min length from first and last string
	int end = Math.min(arr[0].length(), arr[size-1].length()); //Math.min(13,7)
	
	int i = 0;
	
	while ( i < end && arr[0].charAt(i) ==  arr[size-1].charAt(i) )
	{
		i++;
	} 
	
	String pre  = arr[0].substring(0, i );
	
	
	
	System.out.println(end); 
	System.out.println(pre);
	}

}
