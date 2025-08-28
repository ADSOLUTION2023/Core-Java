package com.rays.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
	public static void main(String[] args) {
		List i = new ArrayList();
		i.add("War");
		i.add(2);
		i.add(null);
		i.add(3,5.8);
		i.add('e');
		System.out.println(i);
		
		System.out.println("--For each loop--");
		
		for(Object o : i) {
			System.out.print(o + " ," );
		}
		System.out.println("\n");
		System.out.println("---Iterator Method--");
		
		Iterator it = i.iterator();
		while (it.hasNext()) {
			Object o = (Object) it.next();
			System.out.print(o+",");
		}
		System.out.println("\n");
		System.out.println("--For each method--");
		i.forEach(e -> System.out.print(e + ","));//first way to write
		System.out.println();//one more way to write
		i.forEach(e ->{
			System.out.print(e +",");
		});
		i.forEach(System.out::println);
	}

}
