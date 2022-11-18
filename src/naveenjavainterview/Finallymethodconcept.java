package naveenjavainterview;

public class Finallymethodconcept {

	public static void main(String[] args) {
		int i = 10;
		try
		{
			System.out.println("In Try block");
			int k = i/0;
		}
		catch(NullPointerException e)
		{
			System.out.println("inside catch block");
			System.out.println("Divide by zero error");
		}
		
		finally {
			System.out.println("executed this code even after the exception");
		}

	}

}
