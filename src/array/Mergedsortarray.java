package array;

import java.util.Arrays;

public class Mergedsortarray {

	public static void main(String[] args) {
		
		int[] arrayA = new int[] {-7, 12, 17, 29, 41, 56, 79};
        
        int[] arrayB = new int[] {-9, -3, 0, 5, 19};
         
        int[] mergedArray = new int[arrayA.length + arrayB.length]; //
        
        int i=0, j=0, k=0;
        
        while(i < arrayA.length && j< arrayB.length)    
        {
        	if(arrayA[i] < arrayB[j])      //-7 < -9 in case of ascending order
        	{
        		mergedArray[k] = arrayA[i];
        		i++;
        		k++; 
        	}
        	else
        	{
        		mergedArray[k] = arrayB[j];  // -9 
        		j++;
        		k++; 
        	}
        }
        
        while(i < arrayA.length)
        {
        	mergedArray[k] = arrayA[i];
        	i++;
        	k++;
        }
        
        while(j < arrayB.length)
        {
        	mergedArray[k] = arrayB[j];
        	j++;
        	k++;
        }
        
        System.out.println(Arrays.toString(mergedArray));
        
	}

}
