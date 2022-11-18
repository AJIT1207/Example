
public class SecondLargestArrayElement {

	public static void main(String[] args) {

		int arr[] = {4,5,6,1,2,3};
		
		int secondlargest = 0;
		
		int largest = 0;
		
		int thirdlargest = 0; 
		
		for(int i = 0; i< arr.length; i++)
		{ 
			if(arr[i] > largest)   //4
			{
				secondlargest = largest;
				largest = arr[i];
			}
			
			else if(arr[i] > secondlargest && arr[i] < largest)
			{
				secondlargest = arr[i];
			}
			
			else if(arr[i] > thirdlargest && arr[i] < largest && arr[i] < secondlargest)
			{
				thirdlargest = arr[i];
			}
		}
		System.out.println(thirdlargest);
		System.out.println(secondlargest);
		System.out.println(largest);
		
	}

}
