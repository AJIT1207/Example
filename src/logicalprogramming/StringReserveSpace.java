package logicalprogramming;

public class StringReserveSpace {

	public static void main(String[] args) {

		String input = "ajit kumar jaiswal";
		
		int start = 0;
		int end = input.length()-1;
		
		char ch[] = input.toCharArray();
		
		while(start < end)
		{
			if(ch[start] == ' ')
			{
				start++;
			}
			else if(ch[end] == ' ')
			{
				end--; 
			}
			
			else
			{
				char temp;
				
				temp = ch[start];
				ch[start] = ch[end];
				ch[end] = temp;
				start++;
				end--;
				
			}
			
			
		}
		System.out.println(ch);
	}

}
