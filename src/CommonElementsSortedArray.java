
public class CommonElementsSortedArray {

	public static void main(String[] args) {
		// https://www.ideserve.co.in/learn/find-common-elements-in-n-sorted-arrays#algorithmVisualization
		
		int[][] arrays = {
                {23, 34, 67, 89, 123, 566, 1000},
                {11, 22, 23, 24,33, 37, 185, 566, 987, 1223, 1234},
                {23, 43, 67, 98, 566, 678},
                {1, 4, 5, 23, 34, 76, 87, 132, 566, 665},
                {1, 2, 3, 23, 24, 344, 566}
              };
		
		if(arrays.length < 2)
		{
			System.out.println("too few arrays");
		}
		
		//to store the current index for 0th array
		int baseIndex = 0;
		
		//to store the current index for each of the remaining n - 1 arrays
		int indices[] = new int[arrays.length-1];
		
		//to track in how many arrays a specific element is found
		int totalMatchFound;
		
		//vairable used to terminate the search early
		boolean smallestArrayTraversalComplete = false;
		
		//pick one element from first array and compare with other
		
		while(baseIndex < arrays[0].length & (!smallestArrayTraversalComplete))
		{
			totalMatchFound = 0;
			
			for(int i = 1 ; i < arrays.length; i++)
			{
				int currentIndex = indices[i-1]; 
				
				 // skip all the elements in this array which are less than the element at baseIndex in 0th array
                while ((currentIndex < arrays[i].length) && (arrays[i][currentIndex] < arrays[0][baseIndex]))
                {
                	currentIndex += 1;
                }
                 
                // check if common element(which is equal to element at baseIndex in 0th array) has been found in this array
                if (currentIndex < arrays[i].length)
                {
                    if ((arrays[i][currentIndex] == arrays[0][baseIndex]))
                    {
                        totalMatchFound += 1;
                    }
                }
                // indicates that we have looked at all the elements of 'i'th array 
                else
                {
                    smallestArrayTraversalComplete = true;
                }
                 
                // store this incremented index for this array- 
                // which would help to resume from this point for next matching round
                indices[i-1] = currentIndex;
            } 
             
            // check if element arrays[0][baseIndex] is found in all other arrays
            if (totalMatchFound == arrays.length-1)
            {
                System.out.println(arrays[0][baseIndex]);
            }
            baseIndex += 1;
			
			}
		}
		

	}

