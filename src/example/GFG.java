package example;

public class GFG { 
	public static void main(String[] args) 
	{ 
		// Here array is the array name of int type
		int[] array = new int[4];
		System.out.println("The size of the array is "
				+ array.length);

		// Here str is a string object
		String str = "GeeksforGeeks";
		String newstr[] = str.split(" ") ;
		System.out.println("The size of the String is "
				+ str.length());
		System.out.println("The size of the new String is "
				+ newstr.length);

	}
}
