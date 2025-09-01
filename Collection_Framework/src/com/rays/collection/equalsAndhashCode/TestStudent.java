package com.rays.collection.equalsAndhashCode;

public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student("Ram", "Indore");
		Student s2 = new Student("Ram", "Indore");
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
