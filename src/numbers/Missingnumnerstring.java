package numbers;

import java.util.HashMap;
import java.util.Map;

public class Missingnumnerstring {

	public static void main(String[] args) {
		 String arr[] = {"ax","sd","sdsd","sdsd"};
		 
		 String miss = "sdaaaaa";
		 
		 boolean flag=true;
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 if(miss==arr[i])
			 {
				 flag=false;
				 System.out.println("Number found");
				 break;
			 }
		 }
		 if(flag==true)
		 {
			 System.out.println("number was not there");
		 }
		 

	}

}
