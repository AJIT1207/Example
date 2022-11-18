package example;import java.awt.AlphaComposite;

public class Characteralphanumeric {

	static void isdigitalphanumer(String str)
	{
		char ch[] = str.toCharArray();
		StringBuffer apha = new StringBuffer();
		StringBuffer digit = new StringBuffer();
		StringBuffer special = new StringBuffer();
		int m=0,n=0,o=0;
		for(int i=0;i<ch.length;i++) 
		{ 
			if(Character.isAlphabetic(ch[i]))
			{
				apha.append(str.charAt(i));
				m++;
			}
			else if(Character.isDigit(str.charAt(i)))
			{
				digit.append(str.charAt(i));
				n++;
			}
			else
			{
				special.append(str.charAt(i));
				o++;
			}
		}
		System.out.println(apha + " is alpha" + m);
		System.out.println(digit + " is digit" + n);
		System.out.println(special + " is special" + 0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         isdigitalphanumer("ajit1234spec$%%^");
	}

}
