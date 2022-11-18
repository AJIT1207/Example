import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CommonCharsString {

	public static void main(String[] args) {

		String[] str = {"bella", "label", "roller"};
		int n = str.length;
		// primary array for common characters
        // we assume all characters are seen before.
        Boolean[] prim = new Boolean[26];
        Arrays.fill(prim, new Boolean(true));
 
        // for each string
        for (int i = 0; i < n; i++) {
 
            // secondary array for common characters
            // Initially marked false
            Boolean[] sec = new Boolean[26];
            Arrays.fill(sec, new Boolean(false));
 
            // for every character of ith string
            for (int j = 0; j < str[i].length(); j++) 
            {
 
                // if character is present in all
                // strings before, mark it.
                if (prim[str[i].charAt(j) - 'a'])
                sec[str[i].charAt(j) - 'a'] = true;
            }
 
            // copy whole secondary array into primary
            System.arraycopy(sec, 0, prim, 0, 26);
        }
 
        // displaying common characters
        for (int i = 0; i < 26; i++)
            if (prim[i]){
                System.out.print((char)(i + 'a'));
                System.out.print(" ");
		
            } 
	}
		
//		
//		List<String> commonchars = new ArrayList();
//		
//		int minfrequency[] = new int[26];
//		
//		Arrays.fill(minfrequency, Integer.MAX_VALUE );
//		
//		for(String currentstring : str)
//		{
//			int charfrequencies[] = new int[26];
//			
//			for(char c : currentstring.toCharArray())
//			{
//				charfrequencies[c-'a']++;
//			}
//			
//			for(int i = 0; i < 26 ; i++)
//			{
//				minfrequency[i] = Math.min(minfrequency[i], charfrequencies[i]);
//			}
//			
//		}
//		
//		for(int i=0; i > 26; i++)
//		{
//			while(minfrequency[i] > 0)
//			{
//				commonchars.add("" + (char)(i+'a'));
//				minfrequency[i]--;
//			} 
//		}
//		
//		System.out.println(commonchars);
	}


