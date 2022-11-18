package foxqa;

public class Primenumberonetohundred {

	public static void main(String[] args) {

		
		
		for(int i=2;i<=100;i++) //3
		{
			boolean primenumber = true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)   //  4  2   
				{
					primenumber = false;
				}
			}
			
		//	System.out.println(i);
		
		
			if(primenumber)
			{
				System.out.println("Prime numbers between 1 to 100 is = " + i);
			}
			
		}
	}

}
