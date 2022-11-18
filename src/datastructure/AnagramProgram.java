package datastructure;

import java.util.Arrays;

public class AnagramProgram {

	public static void main(String[] args) {

		String str[]   = {"ajit","tija","abc","cba","ab"};
		
		
		if(str.length<=0)
		{
			System.out.println("empty string");
		}
		

		String record[] = new String[str.length];
		
		String auxilary = "";
		 
		for(int i = 0 ; i < str.length; i++)
		{
			char word[] = str[i].toCharArray();
			
			//sorting the word
			
			Arrays.sort(word);
			
			auxilary = new String(word);
				
			record[i] = auxilary;
		} 
		
		for(int i = 0 ; i < str.length ; i++)
		{ 
			for(int j = i+1; j < str.length; j++)
			{
				if(record[i].equals(record[j]))
						{
							System.out.println("("+str[i]+" : "+str[j]+")");
						}
			}
		}
		 
	}

}
