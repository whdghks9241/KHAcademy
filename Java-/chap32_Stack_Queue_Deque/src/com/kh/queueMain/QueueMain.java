package com.kh.queueMain;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {

	public static void main(String[] args) {
		// ť QUEUE ����
		Queue<String> queue = new LinkedList<>();
		
		/**

			Front				  Rear(tail)
			  |						  |
			  v						  v
  		    +---+		+---+		+---+
			| 1 |	<-  | 2 |  	<-	| 3 |	
			+---+		+---+		+---+
			
			
		 */
		
		queue.offer("Apple");
		queue.offer("Banana");
		queue.offer("Cherry");
	
		// ť���� ��� ���� �� ��� (FIFO ������� ��µ�)
		String removedElement = queue.poll(); // queue���� Apple �� �����ϰ� ��ȯ
		System.out.println(removedElement);
		
		removedElement = queue.poll();
		System.out.println(removedElement);
		
		// ť�� Front ��� Ȯ��(�������� �ʰ� Ȯ�θ�)
		String fontElement = queue.peek(); // queue�� front ��� Cherry ��ȯ
		System.out.println(fontElement);
		
		// ť�� ũ�� Ȯ��
		int size = queue.size(); // 1�� �� ����
		System.out.println("size : " + size);
		
//		while(!queue.isEmpty()) {
//			
//			String element = queue.poll();
//			System.out.println(element);
//		}
	}

}
