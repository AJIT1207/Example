package foxqa;

public class Leapyear {

	public static void main(String[] args) {
		
		boolean leapyear = false;
		
		int year = 2016;
		
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==00)
				{
					leapyear=true;
				}
				else
				{
					leapyear=false;
				}
			}
			else
			{
				leapyear=true;
			}
		}
		
		if(leapyear)
		{
			System.out.println(year + "is a leap year");
		}
		else
		{
			System.out.println(year + "is a leap year");
		}
		
		System.out.println(Math.PI);
	}
}
