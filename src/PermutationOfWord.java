
public class PermutationOfWord {

	static void permutaionword(String permutation, String str)
	{
		if(str.length()==0)
		{
			System.out.println(permutation);
		}
		
		else
		{
			for(int i = 0; i< str.length(); i++)
			{
			permutaionword(permutation + str.charAt(i), str.substring(0, i) + str.substring(i+1, str.length()));
			//System.out.println(s); //
		}
	}} 
	
	public static void main(String[] args) {

		permutaionword("","ajit");

	}

}
