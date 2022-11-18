package logicalprogramming;

public class Stringrotation {

	public static void main(String[] args) {

		String s1  = "JavaJ2eeStrutsHibernate";
		String s2 =  "StrutsHibernateJavaJ2ee";
		
		
		String s3 = s1 + s1;  // JavaJ2eeStrutsHibernateJavaJ2eeStrutsHibernate
		
		
		if(s3.contains(s2))
		{
			System.out.println("rotated");
		}
		else
		{
			System.out.println("not rotated");
		}
	}

}
