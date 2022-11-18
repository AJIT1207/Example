package sortingalgorithm;

public class Reversepaytmstring {

	public static void main(String[] args) {
		
		String input = "This is an apple";
		
		String rev = "";
		
		String words[] = input.split(" ");
		
		for(int i  = 0 ;i< words.length; i++)
		{
			String word = words[i]; 
			String revword = "";
			for(int j = word.length()-1;j>=0;j--)
			{
				char ch = word.charAt(j);
				revword = revword + ch + "";
			}
			 
			rev = rev + revword + " ";
		}
		
		System.out.println(rev);

	}

}
