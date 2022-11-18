package example;

import java.util.Hashtable;
import java.util.Map;

public class Hashtableex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(100, "ajit");
		ht.put(101, "akshat");
		ht.put(102, "poojak");
		ht.put(103, "poojak");
		for(Map.Entry m : ht.entrySet())
		{
			System.out.println(m.getKey() + " hastable " + m.getValue());
		}
	}

}
