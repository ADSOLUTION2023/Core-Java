package com.rays.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMarksheetComparator {
	public static void main(String[] args) {
		List<Marksheet> l = new ArrayList<Marksheet>();
		l.add(new Marksheet(104, 95, "Amit"));
		l.add(new Marksheet(105, 89, "Mit"));
		l.add(new Marksheet(102, 56, "Ram"));
		l.add(new Marksheet(103, 58, "Geet"));
		l.add(new Marksheet(101, 34, "Amit"));
		
		l.forEach(System.out::println);
		
		System.out.println("--Sort by Name--");
		OrderByName byName = new OrderByName();
		Collections.sort(l, byName);
		l.forEach(System.out::println);
		
		System.out.println("--Sort by RollNo--");
		OrderByRollNo byRollNo = new OrderByRollNo();
		Collections.sort(l, byRollNo);
		l.forEach(System.out::println);
		
		System.out.println("--Sort by Percentage--");
		OrderByPercentage byPercentage = new OrderByPercentage();
		Collections.sort(l, byPercentage);
		l.forEach(System.out::println);
	}
}
