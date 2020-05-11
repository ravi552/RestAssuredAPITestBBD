package abstraction.concept;

public class TestBank {

	public static void main(String[] args) {
		HDFCbank hb = new HDFCbank();
		hb.credit();
		hb.debit();
		hb.loan();
		hb.funds();
		
		Bank b= new HDFCbank();
		b.loan();
		b.debit();
		b.credit();
	
	}

}
