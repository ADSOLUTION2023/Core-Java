package com.rays.collection.equalsAndhashCode;

public class Student {
	public String name;
	public String addrs;
	
	public Student(String name,String addrs) {
		this.name = name;
		this.addrs = addrs;
	}
	@Override
	public boolean equals(Object obj) {
		 if (obj == null) {
			 return false;
	}if (!(obj instanceof Student)){
		return false;
	}else {
		Student s = (Student) obj;
		return this.name == s.name && this.addrs == s.addrs;
	}
	}
	
	@Override
	public int hashCode() {
		 String s = name + addrs;
		return s.hashCode();
	}
}
