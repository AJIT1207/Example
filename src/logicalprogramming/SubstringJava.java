package logicalprogramming;

public class SubstringJava {

	public static void main(String[] args) {

		String str = "Ajit";
		
		int length = str.length();
		
	//	int temp[] = new int[(length*(length+1))/2];
		
	for(int i = 0; i < length ; i++)
	{
		for(int j = i+1; j< length ; j++)
		{
			System.out.println(str.substring(i, j)); 
			
		//	temp[length++];
		}

	}
	}

}
