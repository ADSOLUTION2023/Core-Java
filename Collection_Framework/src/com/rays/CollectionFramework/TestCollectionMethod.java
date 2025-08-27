package com.rays.CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionMethod {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add(34);
		c1.add("Amit");
		c1.add(true);
		c1.add('q');
		c1.add(3.4);
		
		Collection c2 = new ArrayList();
		c2.add(34);
		c2.add("Advait");
		c2.add(true);
		c2.add('p');
		c2.add(2.5);
		
		System.out.println("c1:" + c1);
		System.out.println("c2:" + c2);
		//Methods:-
		
		//c1.addAll(c2);
		//System.out.println("c1:" + c1);
		
		c2.add("Amit");
		System.out.println("c2:" + c2);
		
		//c2.clear();
		//System.out.println("c2:" + c2);
		
		System.out.println(c2.contains(3.4));
		System.out.println(c1.containsAll(c2));
		System.out.println(c1.isEmpty());
		System.out.println(!c2.isEmpty());
		c1.remove("Amit");
		System.out.println(c1);
		//c1.removeAll(c2);
		//System.out.println(c1);
		c2.retainAll(c1);
		System.out.println(c2);
		System.out.println("c1 Size :" + c1.size());
	}

}
