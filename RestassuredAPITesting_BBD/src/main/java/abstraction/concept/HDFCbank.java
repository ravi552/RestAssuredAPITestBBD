package abstraction.concept;

public class HDFCbank extends Bank{

	@Override
	public void loan() {
		System.out.println("HDFC loan");
	}
	public void funds() {
		System.out.println("HDFC funds");
	}

}
