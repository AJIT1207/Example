
public class Substring {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		//int {1,9,2,8,3,7,4,6,5};
		
		int start = 0;
		int end = arr.length-1;
		
		int newarr[] = new int[arr.length];
		
		for(int i = 0; i < arr.length; start++, end--)
		{
			while(start < end)
			{
				newarr[start] = arr[i]; 
				newarr[end] = arr[i]; // 1 
				//start++;
				//end--; 
			}
		}
		for(int i = 0; i< arr.length; i++) 
		{
		System.out.println(newarr);
		}
	}

}
