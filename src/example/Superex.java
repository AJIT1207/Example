package example;

import java.util.Arrays;

public class Superex {

//		 
//		// Function to print the sorted array of string
//		// void printArraystring(string,int);
//		 
//		// Function to Sort the array of string
//		// according to lengths. This function
//		// implements Insertion Sort.
//		static void sort(String []s, int n)
//		{
//		    for (int i=1 ;i<n; i++)
//		    {
//		        String temp = s[i];
//		 
//		        // Insert s[j] at its correct position
//		        int j = i - 1;
//		        while (j >= 0 && temp.length() < s[j].length())
//		        {
//		            s[j+1] = s[j];
//		            j--;
//		        }
//		        s[j+1] = temp;
//		    }
//		}
//		 
//		// Function to print the sorted array of string
//		static void printArraystring(String str[], int n)
//		{
//		    for (int i=0; i<n; i++)
//		        System.out.print(str[i]+" ");
//		}
//		 
//		// Driver function
//		public static void main(String args[])
//		{
//		    String []arr = {"GeeksforGeeks", "I", "from", "am"};
//		    int n = arr.length;
//		     
//		    // Function to perform sorting
//		    sort(arr,n);
//		    // Calling the function to print result
//		    printArraystring(arr, n);
//		     
//		}
	
	public static void main(String[] args) {
//		   String []arr = {"GeeksforGeeks", "I", "from", "am"};
//		  
//		   Arrays.sort(arr);
//		   
//		  
//		   
//		   System.out.println(Arrays.asList(arr));
		
		String str = "am India come from I";
		
		String words[]  = str.split(" ");
		
//		String w[] = str.split("");
//		
//		Arrays.sort(w, (a,b) -> Integer.compare(a.length(), b.length()) );
	
		for(int i=0;i<words.length;i++)
		{
			for(int j=i+1;j<words.length;j++)
			{
				String temp;
		//	String tempi = words[i];
//				String tempj = words[j];
				
				if(words[j].length()<words[i].length())
				{
					temp = words[i];
					words[i] = words[j];
					words[j] = temp;
				//	words[j] = tempi;
				}
		}
		}
		
		for(int i=0;i<words.length;i++)
		{
			System.out.println(words[i]);
		}
		
		
				
	}
}

