package example;



interface Shape
{
	void draw();
	double area();
}

class Rectangle implements Shape
{
	int length;
	int width;
	public Rectangle(int length, int width) {
		// TODO Auto-generated constructor stub
	this.length=length;
	this.width=width;
	}
	public void draw()
	{
		System.out.println("Rectangle has been drawn");
	}
	public double area()
	{
		return (double)(length*width);
	}
}

class Circle implements Shape
{
	double pi = 3.14;
	int radius;
	public Circle(int radius) {
		// TODO Auto-generated constructor stub
	this.radius=radius;
	}
	public void draw()
	{
		System.out.println("Circle has been drawn");
	}
	public double area()
	{
		return (double) (pi*radius*radius)/2;
	}
	
}

class Interfaceex {
	public static void main(String args[])
	{
	Shape rect = new Rectangle(3, 4);
	rect.draw();
    System.out.println("Rectangle area " + rect.area());
    
    Shape circle = new Circle(3);
    circle.draw();
    System.out.println("Circle area = " + circle.area());
}
}