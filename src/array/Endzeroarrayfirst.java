package array;

public class Endzeroarrayfirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputarr[] = {2,3,5,0,6,8,9,0,5,0,0,3,6};
		int arrlength =inputarr.length;
		int indexcount = 0;
		
		for(int i=0;i<arrlength;i++)
		{
			if(inputarr[i] !=0)
			{
				inputarr[indexcount++] = inputarr[i];
			}
		}
		while(indexcount<arrlength) 
		{
			inputarr[indexcount++] = 0;
		} 
		
		for(int data : inputarr)
		{
			System.out.print(data + " ");
		}
	}
 
}
