package com.rays.collection.comparator;

public class Marksheet {
	
	public int rollNo;
	public int percentage;
	public String name;
	
	public Marksheet(int rollNo,int percentage, String name) {
		this.rollNo = rollNo;
		this.percentage = percentage;
		this.name = name;
	}
	public String toString() {
		return "MarkSheet[rollNo :" + rollNo + "Percentage : " + percentage + "Name : " + name + "]";
	}

}
