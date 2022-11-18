
public class Staticblock {

	private static final int initialValue;
	private static int finalValue ;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method started");
		
		//System.out.println("Main method ended");
	}
	
	static
	{
		System.out.println("Static block has started...");
		initialValue =10;
		finalValue = initialValue * 5;
		System.out.println(initialValue);
		System.out.println(finalValue);
		System.out.println("Static block has been ended----");
	}
	

}
