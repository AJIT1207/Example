package array;

public class Movenegativeinarray {

	public static void main(String[] args) {

		int arr[] = {-2,1,-5,0,4,-7};
		
		int temp[] = new int[arr.length];
		
		int counter = 0;
		
		for(int i=0;i< arr.length ; i++)
		{
			 if(arr[i]<0)
			{
				temp[counter++] = arr[i];
			}
		}
		
		for(int i=0;i< arr.length ; i++)
		{
			if(arr[i]>=0)
			{
				temp[counter++] = arr[i];
			}
			
			
		}
		
		
		
		for(int i=0; i< arr.length ; i++)
		{
			arr[i]  = temp[i];
		}
			
		for(int i=0; i< arr.length ; i++)
		{
			System.out.print(arr[i] + " ");
		}

	}

}
