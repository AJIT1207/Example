package writingcode;

public class Missingeleinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {1,2,4};
		int n1 = findmissingnumber(num , 4);
		System.out.println(n1);
	}
	public static int findmissingnumber(int num[], int n)
	{
		int expSum = (n*(n+1))/2;
		int actualsum = 0;
		
		for(int i: num) {
			actualsum += i;
		}
		return expSum-actualsum;
	}
}
