import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;



public class AllnumbersdisppareadinArray {

	public static void main(String[] args) {

		int nums[] = {1,4,5,6,7,8};
		
		List<Integer> list = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i : nums)
		{
			set.add(i);
		}
		
		for(int i = 1; i <= nums.length; i++)
		{
			if(!set.contains(i))
				list.add(i);
		}
		

		System.out.print(list );

	}

}
