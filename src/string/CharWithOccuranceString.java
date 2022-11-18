package string;

import java.util.Arrays;

public class CharWithOccuranceString {

	public static void main(String[] args) {
		String input = "opentext";
		char replacechar = 't';
		
		if(input.indexOf(replacechar)==-1)
		{
			System.out.println("character is not present in the string");
			System.exit(0); 
		}
		
		char ch[] = input.toCharArray();
		int count = 1;
		for(int i=0;i<input.length();i++)
		{
			if(ch[i] == replacechar)
			{
				ch[i] = String.valueOf(count).charAt(0);
				count++;
			}
		}
		System.out.println(Arrays.toString(ch));
	}

}
