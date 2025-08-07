package in.co.rays.basic;
import java.util.*;
public class IfElse {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter Number :");
		int n = x.nextInt();
			if (n%2 == 0){
			System.out.println("n is even");
		}else {
			System.out.println("n is odd");
		}
	}
}
