package CustomException;

public class ExceptionDemo {

	public static void main(String[] args) {		
		int i = 8;
		int j = 9;
		
		try {
			int k=i/j;
			System.out.println(k);
			
			if(k==0)
			{
				throw new CustomException("this is custom exception");
				

			} 
		}
		catch (CustomException e) {
			System.out.println("Error " + e.getMessage());
		}
	}

}
