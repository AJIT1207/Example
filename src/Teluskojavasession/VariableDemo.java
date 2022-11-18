package Teluskojavasession;

class Student
{
	int rollno;
	String name;
}

//we can not use non-static variable in static method

public class VariableDemo {
	public static void main(String[] args)
	{
//	int a[] = {1,2,3,4};
	
//	for(int i=0;i<4;i++)
//	{
//		System.out.println(a[i]);
//	}
//	
//	for(int k : a)
//	{
//		System.out.println(k);
//	}
	
	int a[] = {1,2,3,4};
	int b[] = {2,4,6,8};
	int c[] = {5,6,7,8};
	
	for(int m : a)
	{
		System.out.println(m);
	}
	
	int d[][] = {
					{1,2,3,4},    // Jagged Arrays
					{2,4,8},
					{5,6,7,8,9}
				};

	
	for(int i=0;i<d.length;i++)
	{
		for(int j=0;j<d[i]
				.length;j++)
		{
			System.out.print(" " + d[i][j]);
		}
		System.out.println();
	}	
	for(int k[] : d )
	{
		for(int l : k)
		{
			System.out.println(" " + l);
		}
		System.out.println();
	}
}
}