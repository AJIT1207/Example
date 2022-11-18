package array;

//copying array to a new array

//https://tutorial.eyehunts.com/java/java-copy-array-java-array-clone-example/

public class Arraycopy {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6};
		int copyarr[] = new int[arr.length];
		
		for(int i=0;i<arr.length;i++) 
		{
			copyarr[i] = arr[i];
		}
		
		for(int i=arr.length-1;i>=0;i--) 
		
			System.out.println("arr elements of clone array = " + copyarr[i]);
		
		
	} 

}
