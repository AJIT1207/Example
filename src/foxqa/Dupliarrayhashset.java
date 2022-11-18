package foxqa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Dupliarrayhashset {

	public static void main(String[] args) {
	 
	 String str = "ajitsss";
	 char target = 's';
	 char ch[] = str.toCharArray();
	 int counter = 0;
	
	 for(int i=0;i<ch.length;i++)
	 {
		 if(ch[i] == target)
		 {
			  counter++;
				
		 }
		 
	
	 }
	 System.out.println("target character is " + target + " = " + counter );
	}
}
