package com.kh.stackMain;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		
		// stack �� �߰� push();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(5);
	
		
		// stack �� ���� pop();
		
		// stack ��ü �� ���� (�ʱ�ȭ) clear();
		// stack ���� ����� ��(���� �������� ������) ��� peek();
		// stack �� ũ����� size();
		// stack ������ ����ִ��� üũ
		// ����ִٸ� true , �ϳ��� ����ִٸ� false empty();
		// stack 1�� �ִ��� üũ 
		// 1�� �����Ѵٸ� true = contains();
		
		/**
			 |	 5	 |
			 |	 4   |
			 |	 3   |
			 |	 2   |
			 |___1___|
		 */
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
		System.out.println(stack);
	}

}
