package polymorphism;

public class Circle extends Shape {
	public Circle(double radius) {
		super(radius);
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
	//	super.area();
		System.out.println("Area of circle - " + (22/7 * getLength() *  getLength() ));
	}
}
