package foxqa;

public class FirstLetterCapital {

	public static void main(String[] args) {
		
		String str = "hello qa for the testing";
		
		String[] words = str.split(" ");
		
		String finalstatement = "";
		
		for(String word : words)
		{
			char ch[] = word.toCharArray();
			
			char c = ch[0];
			
			String firstchar = String.valueOf(c).toUpperCase(); 
			
			String capitalword = firstchar;
			
			for(int i = 1;i<ch.length;i++)
			{
				capitalword = capitalword + ch[i];
			}
			
			finalstatement = finalstatement + capitalword + " ";
				
		}
		
		System.out.println(finalstatement);	
	}

}
