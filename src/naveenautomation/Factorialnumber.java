package naveenautomation;

public class Factorialnumber {

	public static int factorial(int num)
	{
		int fact=1;
		if(num==0)
		{
			return 1;
		}
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
		
	}
	
	public int fact(int num)
	{
		if(num==0)
			return 1;
		else
			return (num*fact(num-1));
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(factorial(5));
		System.out.println(factorial(1));
		System.out.println(factorial(3));		

	}

}
