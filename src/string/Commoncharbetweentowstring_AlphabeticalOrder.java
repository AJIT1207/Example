package string;

import java.util.Set;
import java.util.TreeSet;

public class Commoncharbetweentowstring_AlphabeticalOrder {

	public static void main(String[] args) {
			String firstString = "thin sticks";
	         
	        String secondString = "thick bricks";
	        
	        char first[] = firstString.replace("\\s", "").toCharArray();
	        
	        char second[] = secondString.replace("\\s", "").toCharArray();
	        
	        Set<Character> firstset = new TreeSet<Character>();
	        
	        Set<Character> secondset = new TreeSet<Character>();
	        
	        for(char c : first)
	        {
	        	firstset.add(c);
	        }
	        
	        for(char c : second)
	        {
	        	secondset.add(c);
	        }
	        
	        firstset.retainAll(secondset);
	        
	        System.out.println(firstset);
	        
	        

	}

}
