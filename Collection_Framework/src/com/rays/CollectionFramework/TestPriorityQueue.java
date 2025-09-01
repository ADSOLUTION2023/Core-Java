package com.rays.CollectionFramework;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class TestPriorityQueue {
	public static void main(String[] args) {
		Queue<Float> q = new  ArrayDeque<Float>();
		
		q.add(4.5F);
		q.add(56.3F);
		//q.add('7');//can't be added because its not a float
		System.out.println(q);
		
		//Iterator<Float> i = q.iterator();
		for(Object o : q) {
			System.out.print(o + ",");
		}
	}
}
