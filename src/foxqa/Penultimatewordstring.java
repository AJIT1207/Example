package foxqa;

public class Penultimatewordstring {

	public static void main(String[] args) {
		
		String str = "Hello qa testing";
		
		String words[] = str.split(" ");
	
		if(words.length>1)
		{
			System.out.println("Penultimate word is = " + words[words.length-2]);
		}
		
		for(String word : words)
		{
			
			System.out.println(word);
		}
	}
}
