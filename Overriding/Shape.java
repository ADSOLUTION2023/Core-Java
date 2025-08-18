package Overriding;

public class Shape {
	protected String color;
	protected int borderWidth;
	
	public String getColor() {
		return color;
	}
	public void setcolor(String color) {
		this.color = color;
	}
	public int getborderWidth() {
		return borderWidth;
	}
	public void setborderWidth(int border) {
		this.borderWidth = border;
	}
	public double area() {
		return 0.0;
	}

}
