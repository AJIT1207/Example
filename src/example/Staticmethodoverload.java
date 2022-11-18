package example;


//This program will illustrate of static method overloading
public class Staticmethodoverload {

	static void sum(int a, int b)
	{
		System.out.println(a+b);
		return ;
	}
	static int sum(int a, int b, int c)
	{
	return (a+b+c);
	} 
	public static void main(String[] args) {
		
		Staticmethodoverload.sum(2, 5);
		
	}

}
