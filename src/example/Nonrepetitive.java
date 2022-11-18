package example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Nonrepetitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ajit kumar jaiswal kumar";
		
		String words[]  = str.split(" ");
		System.out.println(Arrays.asList(words));
		
		Set<String> set = new HashSet<String>() ;
		
		
		
		for(String word : words)
		{
			if(set.add(word)==false)
			{
				System.out.println(word);
			}
		} 
	
//		String non[] = str.split(" ");
//	//	String s;
//		for(String s : non)
//		{			
//			System.out.println(s);
//			ArrayList a = new ArrayList();
			
		}

	
		
	}
