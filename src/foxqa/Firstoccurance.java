package foxqa;

public class Firstoccurance {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,3,4,5,5,6,7};
		
		int num = 3 ;
		
		int size = arr.length;
		
		for(int i = 0 ; i < size ; i++)
		{
			if(arr[i] ==  num)
			{
				System.out.println("Occurence of element : " + arr[i] + " is at place = " + i );
				break;
			}
		}
	}

}
