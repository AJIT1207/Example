package naveenautomation;

public class Palindromenumber {

	public static void palindrome(int num)
	{
		int r ;
		int sum = 0;
		int t;
	//	t=num;
		while(num>0)
		{
			r = num%10;
			sum = r + (sum * 10);
			num=num/10;
		}
		if(num==sum)
		{
			System.out.println("Palindrome = " );
		}
		else
		{
			System.out.println("Not palindrome = " );
		}
	}

	public static void main(String[] args) {
		palindrome(1531);


	}

}
