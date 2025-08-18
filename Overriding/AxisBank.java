package Overriding;

public class AxisBank extends Bank {

	@Override
	public String getName() {
		return "Axis Bank";
	}
	@Override
	public double interesrRate() {
		return 12.67;
	}
}

