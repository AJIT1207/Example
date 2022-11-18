package foxqa;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsCollections {

	public static void main(String[] args) {
		
		String str = "hello qa fox";
		
		String[] words = str.split(" ");
		
		List<String> list =  Arrays.asList(words); 
		
		Collections.reverse(list);
		
		System.out.println(list);
		
		for(String word :words)
		
		{
			System.out.print(word + " ");
		}
		

	}

}
