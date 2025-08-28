package com.rays.collection.list;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumeration {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("War");
		v.add(2);
		v.add(null);
		v.add(3,5.8);
		v.add('e');
		System.out.println(v);
		
		System.out.println("--Enumerator--");
		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			Object o = e.nextElement();
			System.out.print(o + " ,");
		}
		
		System.out.println( "\n" + "--For Each Loop--" );
		for(Object o : v) {
			System.out.print(o + ", ");
		}
		
		System.out.println( "\n" + "--For Each method--" );
		
		v.forEach(l -> System.out.print(l + ","));
		v.forEach(l ->{
			System.out.print("  " + l + ",");	
		});
		System.out.println();
		v.forEach(System.out::print);
	}

}
