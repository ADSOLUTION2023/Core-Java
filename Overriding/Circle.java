package Overriding;

public class Circle extends Shape {
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setradius(int radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		double area = Math.PI * radius * radius;
		return area;
	}
}
