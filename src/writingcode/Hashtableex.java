package writingcode;

import java.util.Hashtable;

public class Hashtableex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable h = new Hashtable();
		h.put(1, "ajit");
		h.put(2, "jaiswal");
		h.put(3, "vmware");
		
		System.out.println(h.size());
		
		h.put(4,"baseline");
		System.out.println(h.size());
		
		System.out.println(h.get(2));
		System.out.println(h.get("ajit"));
		
		Hashtable<Integer, Integer> hi = new Hashtable<Integer, Integer>();
		hi.put(1, 100);
	//	hi.put(2, "ram");
		
	}

}
