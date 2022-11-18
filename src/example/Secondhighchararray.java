package example;

public class Secondhighchararray {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8};
		int highest = 0;
		int secondhigh = 0;
		for(int i=0; i<arr.length;i++)
		{
			if(highest<arr[i])
			{
				secondhigh=highest;
				highest=arr[i];			 
			}
			else if(secondhigh<arr[i])
			{
				secondhigh=arr[i];
			}
		}
		System.out.println(secondhigh);
	}

}
