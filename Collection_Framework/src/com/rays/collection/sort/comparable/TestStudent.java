package com.rays.collection.sort.comparable;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestStudent {
	public static void main(String[] args) {
		List<Student> s = new LinkedList<Student>();
		s.add(new Student(1, "Ram", 34, 50));
		s.add(new Student(4, "Shyam",25,42));
		s.add(new Student(2, "Sid", 30, 10));
		s.add(new Student(3, "Ram", 14, 70));
		
		//System.out.println(s);
		//Iterator it = s.iterator();
		//while(it.hasNext()) {
			//Object o = it.next();
			//System.out.println(o);
		//}
		
		System.out.println("---------------");
		Collections.sort(s);
		//System.out.println("--By Iterator--");
		//Iterator it1 = s.iterator();//with iterator
		//while (it1.hasNext()) {
			//Object o1 = it1.next();
			//System.out.println(o1);
		//}
		System.out.println("--By for Each Loop--");
		s.forEach(System.out::println);//with for each
		
		//System.out.println("--By for each Method");
		//s.forEach(e-> System.out.println(e + ","));
	//}

	}	
}
