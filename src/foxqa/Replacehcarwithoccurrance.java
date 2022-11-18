package foxqa;

public class Replacehcarwithoccurrance {

	public static void main(String[] args) {
		
		String input = "mmmnnnvv";
		
		int count=1;
		for(int i = 0 ;i < input.length(); i++)
		{
			char ch = input.charAt(i);
			
			input.replace(String.valueOf(ch), String.valueOf(count));
			count++;
		}
		
		System.out.println(input); 
	}

}
