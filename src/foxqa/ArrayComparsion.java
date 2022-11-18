package foxqa;

public class ArrayComparsion {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		int b[] = {1,2,3,0,5};
		
		boolean comparestatus = true;
		
		if(a.length==b.length)
		{
			for(int i = 0;i<a.length;i++)
			{
				if(a[i]!=b[i]) 
				{
					comparestatus = false;
					break;
				}
			}
		}
		else
		{
			comparestatus = false;
		}
		if(comparestatus)
		{
			System.out.println("both are true");
		}
		else
		{
			System.out.println("both are unequal");
		}
	}

}
