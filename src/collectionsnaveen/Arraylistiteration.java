package collectionsnaveen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylistiteration {

	public static void main(String[] args) {
		
		List<String> tvseries  =  new ArrayList<String>();
		tvseries.add("Breaking Bad");
		tvseries.add("Panchayat");
		tvseries.add("Big bang theory");
		tvseries.add("Mirzapur");
		//Lambda expression
		tvseries.forEach(shows ->
		{ System.out.println(shows);}
		);
		
		//Iterator
		System.out.println("---------");
		Iterator<String> itr = tvseries.iterator();
		while(itr.hasNext())
		{ 
			String value  = itr.next();
			System.out.println(value);
		}
		
		//Using iterator and Java 8 foreachremaining method
		System.out.println("-----Foreach remaining method-----");
		itr = tvseries.iterator();
		itr.forEachRemaining(show -> 
		{System.out.println(show);}
		);
	}

}
