package writingcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Passwordchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//password should be stored in char array[] rather in string
		String pwd = "Ajit123";
		System.out.println("pwd is " + pwd);
		char[] c = new char[]{'a','j','i','t','1','2', '3'};
		System.out.println("pwd is " + c);
		
		Arrays.fill(c, '*');
		
		for(int i=0;i<c.length; i++)
		{
			System.out.println(c[i]);
		}
	}

}
