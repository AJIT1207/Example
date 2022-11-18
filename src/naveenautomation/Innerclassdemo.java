package naveenautomation;



//Demo of Inner class working
class Outer
{
	static int age = 16;
	private static int salary = 2345566;
	String name = "Java";
	
	class Inner
	{
		public void display()
		{
			System.out.println("age = " + age);
			System.out.println("slary = " + salary);
			System.out.println("name = " + name);
		}
	}
}


public class Innerclassdemo {

	public static void main(String[] args) {
		
		Outer outobj = new Outer();
		Outer.Inner demo = outobj.new Inner();
		demo.display();
		
	}

}
