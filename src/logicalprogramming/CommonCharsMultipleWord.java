package logicalprogramming;

import java.util.Arrays;

public class CommonCharsMultipleWord {

	public static void main(String[] args) {
		
		String[] str = {"Flower","Flow","fl"};
		
		Boolean[] prim = new Boolean[26];
		
		Arrays.fill(prim, new Boolean(true)); 
		
		for(int i = 0;  i < str.length; i++)
		{		
			Boolean[] sec = new Boolean[26];
			Arrays.fill(sec, new Boolean(false));
			
			for(int j = 0; j < str[i].length(); j++)
			{
				
				   if (prim[str[i].charAt(j) - 'a'])
		                sec[str[i].charAt(j) - 'a'] = true;
				
//				if(prim[str[i].charAt(j)-'a'])
//					sec[str[i].charAt(j)-'a'] = true; 
				
			}
			System.arraycopy(sec, 0, prim, 0, 26);
		}
		
		for(int i = 0 ; i < 26; i++)
		{
			if(prim[i])
			{
				System.out.println((char)(i+'a'));
			}
		} 

	}

}
