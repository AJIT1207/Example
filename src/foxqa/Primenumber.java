package foxqa;

public class Primenumber {

	public static void main(String[] args) {


		int number = 3;
		boolean status = true;
		
		if(number>1)
		{
			for(int i =2;i<number;i++)
			{
				if(number%2==0)
				{
					status = false;
				}
			}
		}
		
		else
		{
			status = false;
		}

		if(status)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not a prime number");
		}
		
	}

}
