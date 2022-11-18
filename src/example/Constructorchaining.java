package example;

public class Constructorchaining {
	
	Constructorchaining()
	{
		this(1);
		System.out.println("default constructor");
	}

	Constructorchaining(int x)
	{
		this(4,5);
		System.out.println(x);
	}
	Constructorchaining(int x, int y)
	{
		System.out.println(x*y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new Constructorchaining();
	}

}
