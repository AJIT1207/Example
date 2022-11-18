
public class LongestCommonSubsequence {

	public static int common(char[] ch1, char[] ch2, int l1, int l2) {
		if(l1 == 0 || l2 == 0)
			return 0;
		if(ch1[l1-1] == ch2[l2-1])
			return 1 + common(ch1, ch2, l1-1, l2-1);
		else
			return max(common(ch1,ch2,l1-1,l2), common(ch1,ch2,l1,l2-1));
	}	
		static int max(int a, int b)
		{
			return (a>b) ? a :b;
		}
		

	public static void main(String[] args) {
		
		
		
		String s1 = "ajit";
		String s2 ="at";
		
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		
		int l1  = ch1.length;
		int l2 = ch2.length;
		
		common(ch1, ch2, l1, l2);
		

	}

	

}
