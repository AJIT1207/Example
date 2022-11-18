package naveenautomation;

public class Callbyvalue {

	public static void main(String[] args) {
		
		Callbyvalue obj = new Callbyvalue();
		int x = 10;
		int y = 20;
		obj.sum(x, y); //call by value OR pass by value
		//System.out.println();
		
	}
	
	int sum(int a, int b)
	{
		int	c = a+b;
		return c;
	}
	

}
