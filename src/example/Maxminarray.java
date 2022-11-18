package example;

public class Maxminarray {

	public static void maxarray()
	{
		int max[] = {1,2,7,4,5,6};
		int maximum = 0;
		for(int i=0;i<max.length;i++)
		{
			if(max[i]>maximum)
			{ 
				maximum = max[i];
			}
		}
		System.out.println(maximum);
	}
	private static void minarray() {
		// TODO Auto-generated method stub
		int min[] = {1,2,7,4,5,6};
		int minimum = 0;
		for(int i=0;i<min.length;i++)
		{
			if(min[i]<minimum)
			{
				minimum = min[i];
			}
		}
		System.out.println(minimum);
	}
	


	public static void main(String[] args) {
		maxarray();
		minarray();
	}



}
