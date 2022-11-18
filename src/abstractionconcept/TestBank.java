package abstractionconcept;

public class TestBank {

	public static void main(String[] args) {
		Bank h = new HDFCBank();
		h.credit();
		h.debit();
		h.loan();
	}

}
