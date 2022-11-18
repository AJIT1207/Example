package foxqa;

public class Factorialnumber {

	public static void main(String[] args) {
	
		int num = 5;
		int fact = factorial(num);
		System.out.println("Factorial of the given number is = " + fact  );
	}

	public static int factorial(int n) {
		if(n == 0)
			return 1;
		else
		{
			return n * factorial(n-1);   //5*4 
		}
		
	}

}
