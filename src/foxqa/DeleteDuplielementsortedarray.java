package foxqa;

public class DeleteDuplielementsortedarray {

	public static void main(String[] args) {
		
		int arr[] =  {1,2,3,3,4,5,5,5,6,7,7,7,7}; //1,2,3,4,5,6,7
		
		int j = 0;
		
		for(int i=0;i<arr.length-1;i++)  //11<11 
		{
			if(arr[i]!=arr[i+1])  //  
			{
				arr[j] = arr[i];
				j++;   //7
			}
		}
		
		arr[j] = arr[arr.length-1]; 
		
		for(int k=0;k<=j;k++)
		{
		
		System.out.println(arr[k]);
		}
	}
	
}
