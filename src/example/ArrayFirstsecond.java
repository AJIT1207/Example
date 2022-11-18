package example;

public class ArrayFirstsecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {3,4,1,2,6};
		int first = 0;
		int second = 0;
		for(int i=0;i<arr1.length;i++)
		{
			if(first<arr1[i])   //0<3  seconf 0 first 3  second 3 first 4 
			{
				second = first;
				first = arr1[i];
			}
			else if(second<arr1[i])
			{
				second = arr1[i];
			}
		}
		System.out.println(first);
		System.out.println(second);
	}

}
