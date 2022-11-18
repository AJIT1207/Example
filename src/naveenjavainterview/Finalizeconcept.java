package naveenjavainterview;

public class Finalizeconcept {
	
	public void finalize()
	{
		System.out.println("Finalize method");
	}

	public static void main(String[] args) {
		
		Finalizeconcept f1 = new Finalizeconcept();
		Finalizeconcept f2 = new Finalizeconcept();
		Finalizeconcept f3 = new Finalizeconcept();
		
		f1 = null;
		f2 = null;
		f3 = null;
		System.gc();

	}

}
