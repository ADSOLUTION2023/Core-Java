package in.co.rays.basic;

public class Swapping {
	public static void main(String[] args) {
		// WITH 03 VARIABLES
//		int a = 5;
//		int b = 10;
//		int temp = 0;
//		System.out.println("Before Swapping:" + "\n" + "a = " + a + "\n" + "b = " + b);
//		temp = a;
//		a = b;
//		b = temp;
//		System.out.println("After Swapping:" + "\n" + "a = " + a + "\n" + "b = " + b);
//	}
//
//}
		// WITHOUT 03 VARIABLE
		int a = 5;
		int b = 10;
		System.out.println("Before Swapping:" + "\n" + "a = " + a + "\n" + "b = " + b);
		a = a + b; // a = 15;
		b = a - b; // b = 5;
		a = a - b; // a = 10;
		System.out.println("After Swapping:" + "\n" + "a = " + a + "\n" + "b = " + b);
	}

}