package abstraction.concept;

public class BMW implements Car{

	public void start() {
		System.out.println("BMW--Start");
	}

	public void stop() {
		System.out.println("BMW--Stop");
	}

	public void refuel() {
		System.out.println("BMW--refuel");
	}
	public void theftSafty() {
		System.out.println("BMW--theftsafety");
	}

}
