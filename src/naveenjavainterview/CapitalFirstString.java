package naveenjavainterview;

public class CapitalFirstString {

	public static void main(String[] args) {

		String str = "ajit kumar jaiswal";
		
		String captialword = "";
		
		String word[] = str.split(" ");
		
		for(String words : word)
		{
			String first = words.substring(0, 1).toUpperCase();
			String remaining = words.substring(1);
			captialword = captialword + first + remaining;
			
		} 
			System.out.println(captialword);
		 
	}

}
