package in.co.rays.basic;

import java.util.Scanner;

public class ArmstrongNo {
	public static void main(String[] args) {
		Scanner sp = new Scanner(System.in);
		System.out.println("Enter Number:");

			int n = sp.nextInt();
			int temp = n;
			int r = 0;
			int sum = 0;
			//for (int i=1;i<1000;i++) {
				while(temp>0){
					r = temp % 10;
					sum = sum + r * r * r;
					temp = temp / 10;
				}	
			if(sum==n)
			{
				System.out.println("Its a Armstrong No." + sum);
			}else
			{
				System.out.println("Not a Armstrong No." + sum);
			}
			sp.close();
				//System.out.println("The Armstrong No. between 1 to 1000"+ sum );
	}
}	
	