package Inheritance;

import java.util.Date;

public class Person {
	protected String name;
	protected String address;
	protected Date dob;

	public static final int AVG_AGE = 18;//Constant always in upper case

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public void getAge() {
		Date now = new Date();
		int age = now.getYear() - dob.getYear();
		
		if (age >= AVG_AGE && age<61) {
		 System.out.println("Adult:" + age);
		 
	}else if (age>61) {
		System.out.println("Senior Citizen:" + age);
	}
	}
}
