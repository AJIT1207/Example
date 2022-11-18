package example;

public class Hello {

	public static void main(String[] args) 
    {
		String text = "geeksforgeeks is a coding website for geeks"; 
        String pattern = "geeks"; 
        
        stringMatch(text, pattern);
  
    }
	
	public static void stringMatch(String text, String pattern) 
	{
		int len_t = text.length();
		int len_p = pattern.length();
		int i=0, j=0, k=0;
		
		for(i=0;i<=(len_t-len_p);i++)
		{
			for(j=0;j<len_p;j++)
			{
				if(text.charAt(i+j)!=pattern.charAt(j))
					break;
			}
			if(j == len_p)
			{
				k++;
				System.out.println("Pattern found at position: " + i);
			}
		}
		if(k==0)
			System.out.println("no match found");
		else 
			System.out.println("Total instance founded  = " + k);
			
		}
		
	}
