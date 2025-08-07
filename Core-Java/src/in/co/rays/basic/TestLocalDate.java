package in.co.rays.basic;

import java.time.LocalDate;
import java.time.Period;

public class TestLocalDate {
	public static void main(String[] args) {
		// now METHOD
		LocalDate now = LocalDate.now();
		System.out.println(now);
		// of METHOD
		LocalDate dob = LocalDate.of(2002, 10, 19);
		System.out.println(dob);
		// get METHOD
		System.out.println(now.getDayOfMonth());
		System.out.println(now.getDayOfYear());
		System.out.println(now.getMonth());
		System.out.println("Your Age :- " + (now.getYear() - dob.getYear()));
		// Time Period
		Period p = Period.between(dob, now);
		System.out.println(p.getYears() + " " + p.getMonths() + " " + p.getDays());
	}
}
