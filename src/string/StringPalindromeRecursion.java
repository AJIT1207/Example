package string;

public class StringPalindromeRecursion {
	 static boolean palindrome(String s) {
		
		if(s.length()==0)
			return true;
		else
		{
			
		//	System.out.println(s.charAt(s.length()-1));
			return palindrome(s.substring(0, s.length()-1));
			
		//	System.out.println(value);
		}
	
		
	
		
		
	}
	public static void main(String[] args) {
		String s = "aja";
		String rev = "";
		if(palindrome(s))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	

	}



}
