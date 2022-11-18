package datastructure;

public class BubbleSort {

	public static void main(String[] args) {
		
		BubbleSort b = new BubbleSort();
		int arr[] = {3,77,44,11,99};
		b.bubblesort(arr);

	}

	void bubblesort(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int temp;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
			}
		}
		for(int i=0;i<n;i++)
		{ 
		System.out.print(arr[i] + " ");
		}
	}

}
