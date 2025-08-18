package Overriding;

public class TestShape {
	public static void main(String[] args) {
		System.out.println("--Circle--");
		Shape s =new Circle ();
		Circle c = (Circle)s;//type casting
		s.setborderWidth(3);
		s.setcolor("Red");
		c.setradius(30);
		System.out.println("Area : " + s.area() + " " + "sq. m"  +  "\n"+ "Color :" + s.getColor() + "\n" + "Border Width : " + s.borderWidth);
		
		System.out.println("--Rectangle--");
		Shape s1 = new Rectangle ();
		Rectangle r = (Rectangle)s1;
		s1.setborderWidth(4);
		s1.setcolor("Blue");
		r.setLength(12);
		r.setWidth(10);
		System.out.println("Area : " + s1.area() + " " + "sq. m"  +  "\n"+ "Color :" + s1.getColor() + "\n" + "Border Width : " + s1.borderWidth);
	
		System.out.println("--Triangle--");
		Shape s2 = new Triangle ();
		Triangle t = (Triangle)s2;
		s2.setborderWidth(5);
		s2.setcolor("Green");
		t.setBase(20);;
		t.setHeight(10);
		System.out.println("Area : " + s2.area() + " " + "sq. m"  +  "\n"+ "Color :" + s2.getColor() + "\n" + "Border Width : " + s2.borderWidth);
	}
	
}
