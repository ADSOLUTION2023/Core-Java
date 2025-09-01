package com.rays.collection.comparator;

import java.util.Comparator;

public class OrderByPercentage implements Comparator<Marksheet> {
	@Override
	public int compare(Marksheet o1, Marksheet o2) {
		 if (o1.percentage == o2.percentage) {
			 return o1.name.compareTo(o2.name);
		 }else {
			 return o1.percentage - o2.percentage;
		 }
	}
}