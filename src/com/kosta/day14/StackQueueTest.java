package com.kosta.day14;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueTest {

	public static void main(String[] args) {
		
		method2();
		
	}

	private static void method2() {
		//Queue (FIFO)
		Queue<String> queue = new LinkedList<String>();
		queue.offer("��");
		queue.offer("ȭ");
		queue.offer("��");
	
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue);
	}

	private static void method1() {
		//Stack (LIFO)
		Stack<String> st = new Stack<String>();
		st.push("��");
		st.push("ȭ");
		st.push("��");
		
		System.out.println(st);
		System.out.println(st.get(st.size()-1));
		System.out.println("�������� : " + st.peek());
		System.out.println("������ �� ���� : " + st.pop());
		System.out.println(st);
	}

}
