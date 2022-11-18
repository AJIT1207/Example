import java.util.Arrays;

public class Solution {
    public static void main(String args[]) {
    	int[] nums1 = {1,2};
    	int[] nums2 = {3,4,5};
    	
   //     int merged[]  = new int[nums1.length + nums2.length];
        
//        int x=0, y = 0, z = 0;
//        
//        for(int i = 0; i < merged.length; i++)
//        {
//            while(x < nums1.length && y < nums2.length)
//            {
//                if(nums1[x] < nums2[y])
//                {
//                    merged[z] = nums1[x];
//                  
//                    x++; 
//                    z++;
//                }
//                else 
//                {
//                    merged[z] = nums2[y];
//                    z++;
//                    y++;
//                }
//            }
//            
//            while(x < nums1.length)
//            {
//                merged[z] = nums1[x];
//                z++;
//                x++;
//            }
//            
//            while(y < nums2.length)
//            {
//                merged[z] = nums2[y];
//                z++;
//                y++;
//            }
//            
//        }
        
        int i  = nums1.length;
        int j = nums2.length;
        
        int merged[] =  new int[i+j];
        
        System.arraycopy(nums1, 0, merged, 0, i);
        System.arraycopy(nums2, 0, merged, i, j);
        
        Arrays.sort(merged);
        
        int n = merged.length;
        
        //If the length of the array is even
        int z;
        if(n%2 == 0)
        {
        	 z = n/2;
        	
        	int e = merged[z];
        	int q  = merged[z-1];
        	
        	int ans = (e + q) / 2;
        	
        }
        
        //if the length is odd
        else
        {
        	 z = Math.round(n / 2);
        }
        
        System.out.println(merged[z]);
        
        for(int k = 0; k < merged.length; k++)
        {
        	System.out.println(merged[k]);
        }

    }
}