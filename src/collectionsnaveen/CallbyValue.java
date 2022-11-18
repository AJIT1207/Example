package collectionsnaveen;

public class CallbyValue {
	
	public void callby(int x, int y)
	{
		x++;
		y++;
		System.out.println(x);
		System.out.println(y);
	}
public static void main(String[] args) {
	
	CallbyValue c = new CallbyValue();
	int a = 10;
	int b = 20;
	c.callby(a,b); 
}
}
