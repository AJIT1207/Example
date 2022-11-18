package example;

public class Customexception extends Exception {
	
	private static int accno[] = {1,2,3,4,5};
	
	private static String name[] = {"Ajit","Akshat","Poojak","Mamta","Aftab"};
	
	private static double bal[] = {10000.2, 11111.4, 12345.3, 12312.6, 15434};
	

	public Customexception(String str)
			{
				super(str);
			}

	public static void main(String[] args) {
		try
		{
			System.out.println("ACCNO" + "\t" + "CUSTOMER" + "\t" + "BALANCE");
			
			for(int i=0;i<5;i++)
			{
				System.out.println(accno[i] + "\t" + name[i] + "\t" +  bal[i]);
				if(bal[i]<11000)
				{
					Customexception exc = new Customexception("Balance is less than 10000");
					throw exc;
				}
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
