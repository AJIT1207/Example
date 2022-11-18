package array;

public class LengthCharacterStringwithIMP {

	public static void main(String[] args) {

		String str = "aaaabbdhhhdhs";
		int length = str.length();
		for(int i = 0 ;i< length; i++)
		{
			int counter = 1;
			
			while(i< (length-1) && str.charAt(i)==str.charAt(i+1))
			{
				counter++;
				i++;
			}
			System.out.print(str.charAt(i)+ "" + counter);
		}
		

	}

}
