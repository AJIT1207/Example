package foxqa;

import java.util.Scanner;

public class Stringlastthree {

	public static void main(String[] args) {

		System.out.println("Enter a string");
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		sc.close();
		
	//	String[] newstr = str.split("");
		
		char arr[] = str.toCharArray();
		
		String lastthree = "";
		
		for(int i=arr.length-1;i>=arr.length-3;i--)
		{
			lastthree =  arr[i] + lastthree ; 
		}
		
		System.out.println(lastthree);
	}

}
