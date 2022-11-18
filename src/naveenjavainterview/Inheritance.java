package naveenjavainterview;


class Parent {
	void display()
	{
		System.out.println("parent");
	}

	}


class Child extends Parent
{
	void display()
	{
		System.out.println("child");
	}
}





public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Child();
		p.display();
	}

}
