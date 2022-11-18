package foxqa;

import java.util.Arrays;
import java.util.HashSet;

public class DuplicateArray {
		
	public static void main(String[] args) {
		
		int num[] = {1,2,3,4,2,3};
		
		HashSet<Integer> hash  = new HashSet<Integer>();
		for(int i =0; i<num.length;i++)
		{
			if(hash.add(num[i]) == true)  //1 == f
			{
				System.out.println(num[i]);  
			}
		}
 
	}

}
