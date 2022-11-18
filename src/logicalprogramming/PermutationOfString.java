package logicalprogramming;

public class PermutationOfString {
	
	
//	static void StringPermutation(String input) 
//	{
//		StringPermutation("", input);
//		
//	}
	
	static void StringPermutation(String permutation, String input) 
	{
		if(input.length() == 0)
		{
			System.out.println(permutation);
		} 
		else
		{
			for(int i = 0; i< input.length(); i++)
			{
				StringPermutation(permutation + input.charAt(i), input.substring(0,i) + input.substring(i+1, input.length()));
			} // "" + J, ""+ SP "J", "SP"   //J, ""
		}
	}

	public static void main(String[] args) {

	StringPermutation("","JSP");	  
		
		
		
		}



	}
