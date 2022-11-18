package abstractionconcept;

public class BMW implements Car{
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("BMW - -Start method");
	}

	@Override
	public void stop() {
		System.out.println("BMW  - - stop method");
		
		
	}

	@Override
	public void refuel() {
		System.out.println("BMW - - Refuel method");
	}

}
