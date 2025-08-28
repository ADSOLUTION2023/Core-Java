package com.rays.collection.list;

import java.util.Enumeration;
import java.util.Vector;

public class TestFailSafe {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(34);
		v.add('g');
		v.add('d');
		v.add(null);
		v.add(null);
		v.add("Ram");
		
		System.out.println(v);
		
		Enumeration e = v.elements();
		v.add("Sita");//unlike Iterator we can add elements to vector after declaration of Enumerator 
					//this phenomenon is known as Fail safe.
		
		while (e.hasMoreElements()) {
			Object o = e.nextElement();
			//e.remove();//this method is not available with Enumeration
			System.out.print(o + ",");
		}
	}
}
