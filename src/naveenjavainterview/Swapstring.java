package naveenjavainterview;

public class Swapstring {

	public static void main(String[] args) {
		
		String a = "Java";
		String b = "Python";
		
		a = a+b;
		
		b = a.substring(0,a.length()-b.length());
		
		a = a.substring(b.length());
		
		System.out.println("After swapping a = " + a);
		
		System.out.println("After swapping b =  " + b);
		
		

	}

}
