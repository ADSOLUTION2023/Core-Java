package com.rays.collection.list;

import java.util.Stack;

public class TestStack {
	public static void main(String[] args) {
		Stack s = new Stack ();
		for (int c =1;c<=9;c++) {
			s.push(c);
		}
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		while (!s.isEmpty()) {
			System.out.print(s.pop());
		}
	}

}
