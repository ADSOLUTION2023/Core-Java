package in.co.rays.basic;

public class ForEach {
	public static void main(String[] args) {
		int[] a = { 4, 4, 5, 67, 3, 45, 34, 67, 89 };
		System.out.println( "First Term of Array : " + a[0]);
		for (int b:a) {
			//System.out.print(b + " ");
		}
		System.out.println("The length of Array is : " + a.length);
		for (int i =0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}