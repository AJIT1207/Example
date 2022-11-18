package naveenjavainterview;

public class Reversewordusingrecursion {
	
	
	void reverse(String str)
	{
		if(str == null || str.length() <= 1)
		{
			System.out.println(str);
		}
		else
		{
			System.out.print(str.charAt(str.length()-1)); //tija
			reverse(str.substring(0, str.length()-1)); //0,3  aj
			//System.out.println(str);
		}
	}
	 
	
	public static void main(String[] args) {
		String str = "ajit";
		Reversewordusingrecursion h = new Reversewordusingrecursion();
		h.reverse(str);
		
	}
	}
	