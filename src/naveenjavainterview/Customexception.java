package naveenjavainterview;

class MyException extends Exception 
{
	public MyException(String s) {
		
		super(s);
		
	}
}

public class Customexception {
 
	public static void main(String[] args) {
		
		//Throw an Object of user defined exceptions
		try
		{
			throw new MyException("This is the custom exception");
		}
		catch(MyException e)
		{
			System.out.println("Exception caught");
			
			System.out.println(e.getMessage());
			
		}
		
		

	}

}
