package logicalprogramming;

public class ContainsVowels {

	public static void main(String[] args) {
		String str = "ABCDEFGHI";
		
		String newstr = "";
		
		String consonent = "";
		
		if(str.length() < 5)
		{
			System.out.println("not possible");
			
		}
		
		for(int i = 0; i< str.length(); i++)
		{
			if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')
			{
				newstr = newstr + str.charAt(i);
			}
			else
			{
				consonent = str.charAt(i) + consonent;
				
			}
			
		}
		System.out.println(newstr);
	//	System.out.println(consonent.replace(str.charAt(i), ));
		
		

	}

}
