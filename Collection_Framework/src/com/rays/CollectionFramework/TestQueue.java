package com.rays.CollectionFramework;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestQueue {
	public static void main(String[] args) {
		Queue q = new ArrayDeque();
		
		for (char c ='a';c<='z';c++) {
			q.offer(c);
		}
		System.out.println(q);
		System.out.println("Peek:" + q.peek());
		System.out.println(q);
		System.out.println("Poll:" + q.poll());
		System.out.println(q);
		while (!q.isEmpty()) {
			System.out.print(q.poll());
		}
		System.out.println(q);
	}

}
