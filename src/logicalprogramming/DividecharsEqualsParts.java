package logicalprogramming;

public class DividecharsEqualsParts {

	public static void main(String[] args) {

		String str = "aaaabbbbcccc";
		
		int n = 3; //for dividing
				
		int len = str.length();  //12
		
		int chars = len/n;  //4
		
		
		if(len%n != 0)  
		{
			System.out.println("String can not be divided into equal parts");
		}
		 
		else
		{
			int j = 0;
			while(j < len)
			{
			for(int i = 0 ; i < n ; i++)
			{
				System.out.println(str.substring(j,  j + chars )); //  
				j = j + chars; //
			}
			}
		}

	}

}
