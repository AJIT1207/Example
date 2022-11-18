package foxqa;

import java.util.Scanner;

public class Firsthalfstring {

	public static void main(String[] args) {
		
		System.out.print("Enter a string");
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		sc.close();
		
		int size = str.length();
		
		System.out.println(size);
		
		System.out.println("first hal"
				+ "f of string is = " + str.substring(0,(size/2) ));
		

	}

}
