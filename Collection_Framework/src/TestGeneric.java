import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;



public class TestGeneric {
	public static void main(String[] args) {
		System.out.println("--Generic Declaration 1--");
		SortedSet<Integer> c = new TreeSet<Integer>();
		c.add(3);
		c.add((int) 'd');//compiler type casted to ASCII value for d and 4.5
		c.add((int) 4.5);
		System.out.println(c);//always get print in ascending order
		
		System.out.println("--Generic Declaration 2--"); 
		
		List<String> l = new ArrayList<String>();//Generic Declaration You can restrict type of values stored in list
		l.add("Orange");
		l.add("Purple");
		l.add(2, "Ram");
		l.add(3, "Blue");
		l.add("Red");
		System.out.println(l);
		
		Iterator it = l.iterator();
		
		while (it.hasNext()) {
			Object o = it.next();
			it.remove();
			System.out.print(o + ",");
		}
		System.out.println(l);
	}
}
