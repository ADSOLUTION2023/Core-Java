package com.rays.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestFailFast {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(32);
		l.add(4.5);
		l.add(2, "Ram");
		l.add(3, 'f');
		l.add(true);
		
		System.out.println(l);
		Iterator it = l.iterator();
		//l.add("Sita");//its shows ConcurrentModificationException because we can't add elements after declaration of iteration
						//this is fail fast means you can't add value after iteration declaration
		while(it.hasNext()) {
			Object o = it.next();
			it.remove();
			System.out.print(o + ",");
		}
		System.out.println(l);
	}

}
