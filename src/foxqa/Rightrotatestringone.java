package foxqa;

public class Rightrotatestringone {

	public static void main(String[] args) {


		String name = "java"; // ajav
		
		char namearr[] = name.toCharArray();
		
		int size = namearr.length;
		
		char first = namearr[0];
		
		for(int i=0;i<size-1;i++)  //3
		{
			namearr[i] = namearr[i+1];
		}
		 
		namearr[size-1] = first;
		
		System.out.println(namearr);

	}

}
