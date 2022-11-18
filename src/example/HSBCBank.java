package example;

public class HSBCBank implements USBank, BrazilBank{

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("HSBC bank credit");
	}

	@Override
	public void debit() {
		System.out.println("HSBC Bank debit");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transfer() {
		// TODO Auto-generated method stub
		System.out.println("HSBC transfer account");
	}
	
  public void eduloan()
  {
	  System.out.println("HSBC bank edu loan");
  }
  
  public void carloan()
  {
	  System.out.println("HSBC car loan");
  }

@Override
public void mutualfund() {
	// TODO Auto-generated method stub
	System.out.println("Mutual fund");
	
}
}

