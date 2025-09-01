package com.rays.collection.sort.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestEmployee {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Rahul", 1, 20000));
		list.add(new Employee("Shyam", 2, 30000));
		list.add(new Employee("Sahil", 4, 90000));
		list.add(new Employee("Rishi", 5, 50000));
		list.add(new Employee("Nivedha",3, 20000));
		
		//System.out.print(list);
		
		list.forEach(System.out::println);
		System.out.println("-----------------");
		
		Collections.sort(list);
		list.forEach(System.out::println);
		
	}

}
