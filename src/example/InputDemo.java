package example;

class Vehicle
{
	public void drive()
	{
		System.out.println("Vehicle driving");
	}
}

class Car extends Vehicle
{
	public void drive()
	{
		System.out.println("car driving");
	}
}

public class InputDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	Car c = (Car) new Vehicle();
	c.drive();
	
	}

}
