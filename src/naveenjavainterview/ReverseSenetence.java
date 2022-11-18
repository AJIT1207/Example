package naveenjavainterview;

public class ReverseSenetence {

	public static void main(String[] args) {
		
		String str = "ajit kumar jaiswal";
		
		String revsentence = "";
		
		String newstr[] = str.split(" ");
		
		for(int i = newstr.length-1; i>0; i--)
		{
			String word = newstr[i];
			
			String revword = "";
			
			for(int j = word.length()-1 ; j > 0 ; j--) 
			{
				  char rev  =  word.charAt(j);
				  revword = revword + rev ;
				  
			}
			
			revsentence = revsentence + revword;
		}
		System.out.println(revsentence);
	}

}
