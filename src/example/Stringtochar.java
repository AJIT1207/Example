package example;

public class Stringtochar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello Ajit";
		char ch[] = new char[str.length()];
		
		for(int i=0;i<str.length();i++)
		{
			ch[i] = str.charAt(i);
		}
	    
		for(char c: ch)
		{
			System.out.println(c);
		}
	}

}
