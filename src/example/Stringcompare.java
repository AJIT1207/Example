package example;

public class Stringcompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Abc";			
		String str3 = new String("Abc");
		String str4 = new String("Abc").intern();
		if(str3==str4)
		{
			System.out.println("str3 and str4 are equals");
		}
		else
		{
			System.out.println("str3 and str4 are not the same");
		}
		
		if(str1==str4)
		{
			System.out.println("str1 and str4 are same");
		}
		else
		{
			System.out.println("str1 and str4 are not the same");
		}
	}

}
