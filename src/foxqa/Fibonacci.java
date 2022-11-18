package foxqa;

public class Fibonacci {

	public static void main(String[] args) {
		int number = 50;
		
		int a = 0;
		int b = 1;
		
		System.out.println(a + " ");
		System.out.println(b + " ");
		
		int sum = 0;
		
		while(sum<=number)
		{
			sum  = a+ b;
			
			
			if(sum>number)
				break;
			
		
			System.out.print(sum + " ");
			a = b;
			b = sum;
		
		}

	}

}
