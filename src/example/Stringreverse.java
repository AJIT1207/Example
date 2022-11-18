package example;

public class Stringreverse {
	public static void main(String[] args) {
		String s1 = "ajit";
		String s2 = "ajit";
		if(s1.equals(s2))
		{
			System.out.println("boyth objects are same and are created in String constant pool");
		}
		else
		{
			System.out.println("diff objects, yes these objects stored in heap");
		}
	}

}
