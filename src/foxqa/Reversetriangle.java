package foxqa;

public class Reversetriangle {

	public static void main(String[] args) {
		reversetriangle();
	}
	public static void reversetriangle()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}		
			for(int k=0;k<=i;k++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		 
	}
}
