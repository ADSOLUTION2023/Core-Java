package com.rays.CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(5);
		c.add(4.5);
		c.add("Amit");
		c.add('a');
		c.add(true);
		System.out.println(("--Array Print--"));
		System.out.println(c);
		
		System.out.println("--Individual Array--");
		for(Object o : c) {
			System.out.println(o);
		}
		
	}

}
