package naveenjavainterview;

import java.util.HashMap;
class HelloWorld {
    public static void main(String[] args) {
    String input = "ajitja";
    
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
  //  char[] ch = input.toCharArray();
    for(int i=0;i<input.length();i++)
    {
    	char ch = input.charAt(i);
        if(map.get(ch)==null)
        {
            map.put(ch,1);
        }
        else
        {
            map.put(ch, map.get(ch)+1);
        }
    }
    
    for(int i = 0;i<input.length();i++)
    {
    	char ch = input.charAt(i);
        if(map.get(ch)==1)
        {
            System.out.println("first non-repeated char " + ch);
            break;
        }
    }
    
    }
}
