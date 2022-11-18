package logicalprogramming;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class LongestSubstring {

	public static void main(String[] args) {
		
		String str = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(str));
	}
		 public static int lengthOfLongestSubstring(String s) {
		      int j = 0 , i = 0,  max = 0;
		        Set<Character> set = new HashSet<Character>();
		       while(j < s.length())
		        {
		               if(!set.contains(s.charAt(j)))
		               {
		                // set.add(s.charAt(j++));
		                 set.add(s.charAt(j++));
		                 System.out.println(set);
		                   
		                 max = Math.max(max, set.size());  
		               }
		               
		                else
		                {
		                    set.remove(s.charAt(i++));
		                    
		                }
		              
		        }
		       
		        return max;
		    }
		}
