package com.rays.collection.sort.comparable;

public class Employee implements Comparable<Employee>{
	
	public String name;
	public int id;
	public int salary;
	 
	public Employee(String name, int id, int salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	 	}
	public String toString() {
		return "Name:" + name + "id: " + id  + " Salary: " + salary;
	}
	@Override
	public int compareTo(Employee o) {
		//return o.id - this.id; descending order
		//return this.id - o.id; ascending order
		 return this.name.compareTo(o.name);//Alphabetical order
	}
}
