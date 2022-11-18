package writingcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import example.ArrayList;

public class ShiftZerotoright {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[] = new int[] {1,0,3,0,4,0,0,0};
		List<Integer> zero = new LinkedList();
		List<Integer> nonzero = new LinkedList();
		
		for(int arr : i)
		{
			if(arr==0)
			{
				zero.add(arr);
			}
			else
			{
				nonzero.add(arr);
			}
		}
		zero.addAll(nonzero);
		System.out.println(Arrays.asList(zero));
		System.out.println(Arrays.asList(nonzero));
		
	}

}
