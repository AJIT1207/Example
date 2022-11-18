package foxqa;

import java.util.Arrays;

public class Rotatearraythreeright {

	public static void main(String[] args) {
	
		int arr[] = {1,2,3,4,5};
		
		int size = arr.length;
		
	
		
		int n = 3;
		
		for(int j=1;j<=n;j++)
		{
			int last = arr[size-1];
		for(int i = size-1;i>0;i--)
		{
			arr[i] = arr[i-1];
		} 
		
		
		arr[0] = last;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
