package foxqa;

public class CharDigitRaw {

	public static void main(String[] args) {
		
		String str = "ajit123###";
		StringBuffer alphanumeric = new StringBuffer();
		StringBuffer character = new StringBuffer();
		StringBuffer spaceit = new StringBuffer();
		
		
		
		char ch[] = str.toCharArray();
		
		int digit = 0;
		int charcount = 0;
		int space = 0;
		int raw = 0;
		
		
		for(Character c : ch)
		{
			if(Character.isLetter(c))
			{
				charcount++;
				alphanumeric.append(c);
				
				
			}
			else if(Character.isDigit(c))
			{
				digit++;
			}
			
			else if(Character.isSpaceChar(c))
			{
				space++;
			}
			
			else
			{
				raw++;
			}
		
				
		}
		
	
		System.out.println(alphanumeric);
		System.out.println(digit);
		System.out.println(raw);
		System.out.println(space);

	}

}
