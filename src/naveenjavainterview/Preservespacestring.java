package naveenjavainterview;

import java.util.Arrays;

public class Preservespacestring {

	public static void main(String[] args) {

		String str = "ajit kumar jaiswal";
		int length  = str.length();
		int first = 0; 
		int last = length-1; //
		
		char ch[] = str.toCharArray();
		
		while(first < last)
		{
			if(ch[first]== ' ')
			{
				first++;
				continue;
			}
			else if(ch[last] == ' ')
			{
				last--;
				continue;
				
			}
			else
			{
				char temp;
				temp = ch[first];
				ch[first] = ch[last];
				ch[last] = temp;
				first++;
				last--;				
			}
		}
				
			System.out.println(String.valueOf(ch));
	}

}
