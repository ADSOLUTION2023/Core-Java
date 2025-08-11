package Inheritance;

public class Rectangle extends Shape {
	private int Length;
	private int Width;
	
	public int getLength() {
		return Length;
	}
	public void setLength(int length) {
		Length = length;
	}
	public int getWidth() {
		return Width;
	}
	public void setWidth(int width) {
		Width = width;
	}
	public double area() {
		double area = Length * Width;
		return area;
	}
	

}
