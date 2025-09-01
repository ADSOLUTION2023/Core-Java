package com.rays.collection.sort.comparable;

public class Student implements Comparable<Student>{
	private String name;
	private int id;
	private int physics;
	private int maths;
	
	public Student(int id,String name,int physics,int maths) {
		this.id = id;
		this.name = name;
		this.physics = physics;
		this.maths = maths;
	}
	
	public String toString() {
		return "Student [id :" + id + "Name :" + name + "Physics : " + physics + "Maths :" + maths + "]";
	}
	@Override
	public int compareTo(Student o) {
		//return o.id - this.id;
		//return this.id - o.id;
		return this.name.compareTo(o.name);
	}

}
