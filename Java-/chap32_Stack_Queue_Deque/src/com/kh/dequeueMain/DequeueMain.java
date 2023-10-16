package com.kh.dequeueMain;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueMain {

	public static void main(String[] args) {
		
		/**
					  ����   				            ��
							 
					   |					        |
					   V					        V
							 
					[First]  <->  [Second]  <->  [Third]

				 ^										    ^		
				 |											|
				
			[         ]								   [         ]
		
		 */
		
		
		// ArrayDequeue ����Ͽ� Dequeue ����
		Deque<String> deque = new ArrayDeque<>();
		
		// ��� ���
		deque.addFirst("First");
		deque.add("test");
		deque.addLast("Last");
		
		// �� �հ� �� �� ��� Ȯ��
		System.out.println(deque.getFirst());
		System.out.println(deque.getLast());
		
		// �� �հ� �� �� ��� ����
		deque.removeFirst();
		deque.removeLast();
		System.out.println(deque);
		
		
	}
}
