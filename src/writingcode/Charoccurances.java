package writingcode;

public class Charoccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "i love coding";
		String str1 = "i love coding and programming";
		
		getcharoccur(str, 'i');
		getcharcount(str1, 'o');
		
		//str.chars().mapToObj(e )
	}
	public static void getcharcount(String str, char val)
	{
		int count = 0;
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i) == val)
			{
				count++;
			}
		}
		System.out.println(val + ":" + count);
	}
		
		public static void getcharoccur(String str, char val)
		{
			int count = 0;
			for(char ch : str.toCharArray())
			{
				if(ch == val)
				{
					count++;
				}
				
			}
			System.out.println(val + ":" + count);
		}
		}
