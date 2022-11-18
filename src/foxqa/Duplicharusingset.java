package foxqa;

import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicharusingset {

	public static void main(String[] args) 
	{
		String str = "hututu";  //1 u-3 t-2
		
		char arr[] = str.toCharArray();
		
		Set<Character> set = new LinkedHashSet<Character>();
		
		for(Character c : arr)
		{
			if(set.add(c)==false)
			{
				System.out.println("false characters are = " + c);
			}
		}
		
		StringBuffer sb = new StringBuffer();
		
		for(Character c : set)
		{
			sb.append(c);
		}
		
		System.out.println(sb);
	}

}
