package Inheritance;

public class Triangle extends Shape {
	private int c;
	private double h;
	private int a;
	private int b;

	public int getBase() {
		return b;
	}

	public void setBase(int base) {
		this.b = base;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public double area() {
		double area = (0.5) * b * h;
		return area;
	}
	public double area1() {
		double s = (a+b+c)/2;
		//System.out.println("s: " + s);
		double area1 = (s-0)*(s-a)*(s-b)*(s-c);
		//System.out.println("area1: " + area1);
		double area2 = Math.sqrt(area1);
		return area2;
	}
}
