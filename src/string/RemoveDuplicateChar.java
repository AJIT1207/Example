package string;

public class RemoveDuplicateChar {

	public static void main(String[] args) {

		String str = "programming";
		
		char ch[] = str.toCharArray();
		
		StringBuilder builder = new StringBuilder();
		
		for(int i =0 ;i < ch.length; i++)  // p r o g r a m m i n g
		{
			boolean isRepeated = false;
			
			for(int j = i+1 ; j< ch.length; j++)   // p 
			{
				if(ch[i]==ch[j])
				{
					isRepeated = true;
					break; 
				}
			}
			
			if(!isRepeated)
			{
				builder.append(ch[i]);  // p    // j a v a    -- j > a j a    
			}
		}
		System.out.println(builder);
	}

}
