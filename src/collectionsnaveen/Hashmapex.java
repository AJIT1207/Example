package collectionsnaveen;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmapex {

	public static void main(String[] args) {
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		
		Employee e1 = new Employee("ajit",1,"QA");
		Employee e2 = new Employee("akshat",2,"Dev");
		Employee e3 = new Employee("poojak",3,"Admin");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		//traverse the hashmap
		
		for(Map.Entry<Integer, Employee> m : emp.entrySet())
		{
			int key = m.getKey();
			Employee e = m.getValue();			
			System.out.println(key +" Info.");
			
			System.out.println(e.name + " " + e.id + " " +e.role);
			
		}
		

	}

}
