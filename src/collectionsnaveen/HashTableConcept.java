package collectionsnaveen;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		
		Hashtable h1 = new Hashtable();
		h1.put(1, "Ajit");	
		h1.put(3, "Java");
		h1.put(2, "QA");
		
		Hashtable h2 = new Hashtable();
		h2 = (Hashtable) h1.clone();
		
		System.out.println("Values from h1 = " + h1);
		System.out.println("Values from h2 = " + h2);
		
			
	}

}
