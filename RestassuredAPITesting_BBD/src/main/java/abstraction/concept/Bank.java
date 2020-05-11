package abstraction.concept;

public abstract class Bank {
	
	public abstract void loan();
	
	public void credit() {
		System.out.println("bank credit");
	}
	public void debit() {
		System.out.println("bank debit");
	}
}
