package string;

public class Reversewordstring {

	public static void main(String[] args) {
		reverseword("Ajit Kumar Jaiswal");
		
	}
		
	
		
		public static void reverseword(String str)
		{
			String words[] = str.split(" ");
			
			String revstring = "";
			
			for(int i=0;i<words.length;i++)
			{
				String word = words[i];
				 
				String revword = "";
				
				for(int j=word.length()-1;j>=0;j--)
				{
					revword = revword + word.charAt(j);
				//	System.out.println("reversing of a word =  " + revword);
				}
				System.out.println(revword);
				revstring = revstring + revword + " "; 
			}
			System.out.println("Original string is = " + str);
			System.out.println("After reversing the string = " + revstring);
						
		}
}
