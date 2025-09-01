package com.rays.collection.list;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
	public static void main(String[] args) {
		List l = new LinkedList();
		l.add(32);//use only numeric value at first place (1,32),(2,Ram) etc
		l.add(4.5);
		l.add(2, "Ram");
		l.add(3, 'f');
		l.add(true);
		
		System.out.println(l);
		System.out.println(l.get(4));
		l.add(3, "Ram");
		l.add(3, "Ram");
		System.out.println(l);
		System.out.println(l.get(4));
		System.out.println(l.indexOf("Ram"));
		System.out.println(l);
		System.out.println(l.lastIndexOf('f'));//only duplicate values 
		System.out.println(l.subList(2, 6));
		l.remove(6);
		System.out.println(l);
		System.out.println(l.set(3, true));//replaces value
		System.out.println(l);
		l.add(4, "Sita");
		System.out.println(l);//Shifts the index and a
	}

}
