package example;

public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		int d =a.div(30,10);
		System.out.println(d);
	}
		public int div(int x, int y)
		{
			System.out.println("Div operation");
			int z = x/y;
			return z;
		}
}
