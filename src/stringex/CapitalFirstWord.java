package stringex;

public class CapitalFirstWord {

	public static void main(String[] args) {
		//for reversing word in string
		String str =  "ajit kumar jaiswal";
		String result = "";
		String words[] = str.split("\\s");
		
		for(int i =0 ; i<words.length;i++)
		{
			String word = words[i];
			
			String revword = "";
			
			for(int j = word.length()-1;j>=0;j--)
			{
				revword = revword + word.charAt(j);
				
				
			}
			
			result = result + revword + "";
		}
		
		System.out.println(result);
		
		//for making each word as capital
		/*
		 * String words[] = str.split("\\s");
		 * 
		 * for(String w : words) { String first = w.substring(0, 1).toUpperCase();
		 * String restword = w.substring(1); result = result + first + restword ; }
		 * 
		 * System.out.println(result);
		 */

	}

}
