package logicalprogramming;

public class Longestrepeatingsequence {

	public static void main(String[] args) {
		
		String str = "abdfaabdfh";
		
		String newstr = null;
		
		int count = 0;
		
		for(int j = 0; j< str.length()-1; j++)
		{
		
		for(int i = j; i< str.length(); i++)
		{		
		 newstr = str.substring(j, i+1); 
		
			
		
		}		
		}
		
		System.out.println(newstr);
	}

}
