package Overriding;

public class TestBank {
	public static void main(String[] args) {
		Bank b1 = new AxisBank();
		System.out.println("Bank Name : " + b1.getName() + "\n" + "Interest Rate :" + b1.interesrRate());

		Bank b2 = new HDFCBank();
		System.out.println("Bank Name : " + b2.getName() + "\n" + "Interest Rate :" + b2.interesrRate());

		Bank b3 = new ICICIBank();
		System.out.println("Bank Name : " + b3.getName() + "\n" + "Interest Rate :" + b3.interesrRate());
	}
}
