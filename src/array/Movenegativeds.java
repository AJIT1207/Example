package array;

import java.util.List;
import java.util.ArrayList;

//import example.ArrayList;

public class Movenegativeds {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,-6,4,-8,7,-10};
		
		List<Integer> allNumbers = new ArrayList<>();
		List<Integer> negativeNumbers = new ArrayList<>();
		
		for (Integer data : arr) {
			if(data>=0)
			{
				allNumbers.add(data); 
			}
			else
			{
				negativeNumbers.add(data);
			}
			
		} 
		
		allNumbers.addAll(negativeNumbers);
		System.out.println(allNumbers);
		
		
		
	}

}
