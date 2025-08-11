package Inheritance;


public class TestShape {
	public static void main(String[] args) {
		System.out.println("--Circle--");

		Circle c = new Circle();
		c.setRadius(10);
		c.setBorderWidth(5);
		c.setColor("Red");
		c.area();
		System.out.println("Radius :-" + c.getRadius() + "\n" + "Border Width :" + c.getBorderWidth() + "\n"+ "Color :"
				+ c.getColor() + "\n"+ "Area :" + c.area());
		
		System.out.println("--Rectangle--");
		
		Rectangle rec = new Rectangle();
		rec.setLength(15);
		rec.setWidth(20);
		rec.setBorderWidth(3);
		rec.setColor("Blue");
		rec.area();
		
		System.out.println("Length :" + rec.getLength() + "\n" + "Width:" + rec.getWidth()+ "\n" + "Border Width :" + rec.getBorderWidth() + "\n"+ "Color :"
				+ rec.getColor() + "\n"+ "Area :" + rec.area());
		
		System.out.println("--Triangle--");
		
		Triangle tri = new Triangle();
		tri.setA(3);
		tri.setBase(5);
		tri.setC(4);
		tri.setH(2.4);
		tri.setColor("Green");
		tri.area();
		tri.area1();
		
		System.out.println("First Side:" + tri.getA() + "\n" + "Second Side:" + tri.getBase()+ "\n" + "Third Side:" + tri.getC() + "\n"+ "Color :"
				+ tri.Color + "\n"+ "Area :" + tri.area() + " \n" + "Area1 :" + tri.area1());
	}

}
