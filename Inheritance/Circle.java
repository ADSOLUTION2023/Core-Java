package Inheritance;

public class Circle extends Shape {

	private int r;

	public int getRadius() {
		return r;
	}

	public void setRadius(int radius) {
		this.r = radius;
	}

	public double area() {
		double area = Math.PI * r * r;
		return area;
	}

}
