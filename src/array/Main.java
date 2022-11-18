package array;

class Main {
	public static void main(String[] args)
	{
		// Declaring 2-D array with 2 rows
		int a[] = {1,2,3};
      int b[] = new int[a.length];
      
      for(int i=0;i<a.length;i++)
      {
    	  b[i] = a[i];
      }
      
      for(int i=0;i<b.length;i++)
      {
    	  System.out.println("Array b element = " + b[i]);
      }
	}
}