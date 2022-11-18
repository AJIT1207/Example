
public class MergedSortedArray {

	public static void main(String[] args) {

		int arr1[]  = {-3,1,2,4,5,10};
		int arr2[]  = {4,5,7,8,9,11};
		
		int mergedarray[] = new int[arr1.length + arr2.length];
		
		int x = 0, y = 0, z = 0;
		
		for(int i = 0 ; i< mergedarray.length; i++)
		{
			while(x < arr1.length && y < arr2.length)
			{
				if(arr1[x] < arr2[y])
				{
					mergedarray[z] = arr1[x];
					z++;
					x++; 
				
				}
				else 
				{
					mergedarray[z] = arr2[y];
					z++;
					y++;
				}
				
		 	}
			
			while(x < arr1.length)
			{
				mergedarray[z] = arr1[x];
				z++;
				x++;
			}
			while(y < arr2.length) 
			{
				mergedarray[z] = arr2[y];
				z++;
				y++;
			}
		}
		for(int i = 0; i< mergedarray.length; i++)
		{
			System.out.println(mergedarray[i]);
		}
	}

}
