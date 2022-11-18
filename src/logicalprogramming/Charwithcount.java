package logicalprogramming;

import java.util.HashSet;
import java.util.Set;

public class Charwithcount {

	public static void main(String[] args) {

		String str = "daaaabbbbcccfhdfhhdc"; 
		
		char ch[] = str.toCharArray();
		
		
		
		for(int i = 0; i< ch.length; i++)
		{
			int count = 1;
			while(i+1 < ch.length && ch[i] == ch[i+1]) // 1 < 15 
				
			{
				++i;
				count++; 				
			}
			 
			System.out.print(count+""+ch[i] +" ");
		}
		

	}

}
