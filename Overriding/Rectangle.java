package Overriding;

public class Rectangle extends Shape {
	private int Length;
	private int Width;
	
	public int getLength() {
		return Length;
	}
	public void setLength (int Length) {
		this.Length = Length;
	}
	public int getWidth() {
		return Width;
	}
	public void setWidth (int Width) {
		this.Width = Width;
	}
	@Override
	public double area() {
		double area = Length * Width;
		return area;
	}
}
