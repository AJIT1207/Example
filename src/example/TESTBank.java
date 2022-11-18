package example;

public class TESTBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.eduloan();
		hs.carloan();
		hs.transfer();
		
		//dynamic polymorphism
		//child class can be referred by Interface reference var
		
		USBank a  = new HSBCBank();
		a.credit();
		a.debit();
		a.transfer();
		
		
	}

}
