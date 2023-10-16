package com.kh.Practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PracticeMain {

	public static void main(String[] args) {
		
		PracticeMain pm = new PracticeMain();
//		pm.PracticeStack();
		pm.PracticeQueue();
		
	}
	
	public void PracticeStack() {
		
		// stack�� ���� �����ϰ� �����ϰ� �ʱ�ȭ �� �޼��� ����غ���
		Stack<String> stack = new Stack<>();

		stack.push("������ ����");
		stack.push("��������");
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);

		stack.push("�߰��� ����");
		stack.push("������������");
		stack.push("������������");
		stack.push("������������");
		stack.push("������������");

		System.out.println(stack.empty());
		System.out.println(stack.size());
		System.out.println(stack.contains(stack));
		System.out.println(stack);
		
		stack.clear();
		System.out.println(stack);
	}
	
	public void PracticeQueue() {
		
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("ù��° �߰�");
		queue.offer("�ι�° �߰�");
		queue.offer("����° �߰�");
		queue.offer("�׹�° �߰�");
		queue.offer("�ټ���° �߰�");
		queue.offer("������° �߰�");

		System.out.println("---------- poll ----------");
		String firstRemove = queue.poll();
		System.out.println(firstRemove);

		System.out.println("---------- peek ----------");
		String fontCheck = queue.peek();
		System.out.println(fontCheck);
		
		System.out.println(queue);
		
		for(String str : queue) {
			System.out.println(str);
		}
	}

}
