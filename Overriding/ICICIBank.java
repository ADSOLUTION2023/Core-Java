package Overriding;

public class ICICIBank extends Bank {

	@Override
	public String getName() {
		return "ICICI Bank";
	}
	@Override
	public double interesrRate() {
		return 13.87;
	}
}
