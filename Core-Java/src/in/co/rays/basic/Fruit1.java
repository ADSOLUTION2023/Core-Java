package in.co.rays.basic;

public class Fruit1 {
	public static void main(String[] args) {
		String [] Fruit = {"Mango","Banana","Guava"};
		String n  = "Banana";
		String m = "Mango";
		String o = "Guava";
		int position = 0;
		for (int i = 0; i < Fruit.length; i++) {
			if (Fruit[i]==n) {
				position =i;
				System.out.println("The Index of n is : " + position);
				}
			if (Fruit[i]==m) {
				position =i;
				System.out.println("The Index of m is : " + position);
			}
			if (Fruit[i]==o) {
				position =i;
				System.out.println("The Index of o is : " + position);
			}
		}
	}
}
