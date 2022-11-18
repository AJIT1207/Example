package array;

import java.util.ArrayList;
import java.util.List;

public class EndzeroarraySecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputarr[] = {2,3,5,0,6,8,9,0,5,0,0,3,6};
		
		List<Integer> nonzero = new ArrayList<Integer>();
		List<Integer> zeroes = new ArrayList<Integer>();
		//int count = 0;
		for(int data : inputarr)
		{
			if(data!=0)
			{
				nonzero.add(data);
			}
			else
			{
				zeroes.add(data);
			}
		}
		zeroes.addAll(nonzero);
		System.out.print(nonzero);
		System.out.print(zeroes);
	}

}
