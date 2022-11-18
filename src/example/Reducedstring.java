package example;

/*
public class Reducedstring 
{
	public static void main(String[] args)
	{
		String s = "baab";
		if(s.length()==0)
		{
			System.out.println("Empty string");
		}
		else
		{
			for(int j=0;j<=(s.length()/2);j++)
			{
				for(int k=j+1;k<(s.length()-1);k++)
				{
					if(s.charAt(j)==s.charAt(k))
					{
						s = s.replaceFirst(String.valueOf(s.charAt(j)), "");
						s = s.replaceFirst(String.valueOf(s.charAt(j)), "");
					}
				}

			}
		}
		System.out.println("Reduced string = " + s);
	}
}

*/

import java.util.*;

public class Reducedstring {

    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
       // String str = sc.next();
    	String str = "baaba";
       
        for (int j=0; j<str.length()-1;j++)
        {
        if(str.charAt(j) == str.charAt(j+1))
        {
           str=str.replaceFirst(String.valueOf(str.charAt(j)),"");
          // str=str.replaceFirst(String.valueOf(str.charAt(j)),"");
            }
         }
        
        if(str.length()==0){
            System.out.print("Empty String");
        }
        else 
        System.out.print("Reduced string is = " + str);
    }
}
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

