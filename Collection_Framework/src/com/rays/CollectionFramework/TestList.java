package com.rays.CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		// try {
		List list = new ArrayList();
		list.add(0, 2);
		list.add(3.4);
		list.add("Durva");
		list.add("Durva");
		list.add("Durva");
		list.add(2, "Advait");
		list.add(true);
		list.add(4, 'q');

		System.out.println(list);
		System.out.println(list.get(4));
		list.remove(2);
		System.out.println(list);
		list.set(3, "Ram");
		System.out.println(list);
		System.out.println(list.indexOf("Durva"));
		System.out.println(list.lastIndexOf("Advait"));
		System.out.println(list.subList(0, 6));

		// } catch (Exception e) {
		// System.out.println("Exception:" + e.getMessage());
		// }finally {
		// System.out.println("Finish");
		// }

	}

}
