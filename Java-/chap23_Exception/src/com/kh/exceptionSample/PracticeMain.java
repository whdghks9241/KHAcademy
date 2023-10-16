package com.kh.exceptionSample;

public class PracticeMain {
	
	public static void main(String[] args) {
		
		PracticeMain pm = new PracticeMain();
//		pm.ArithException();
//		pm.NPException();
//		pm.NumFormatException();
		pm.ExceptionExam();
		
	}
	public void ArithException() {
		// int dividend / divisor �������� �� ����ó��
		int dividend = 100;
		int divisor = 0;
		
		try {
			int result = dividend / divisor;
			System.out.println(result);
		} catch(ArithmeticException e) {
			
			System.out.println("��� �������� ���� �߻��� ����!! " + e.getMessage());
		}
	}

	public void NPException() {

		String text = "Hello World";
		String subText = null;
		
		try {
			// indexOf subText �� �ִ� null ���� ������ ���ڿ� �˻�
			
			int length = text.indexOf(subText);
			System.out.println(length);
		} catch(NullPointerException s) {
			System.out.println("���ڱ��� üũ " + s.getMessage());
		}
	}
	
	public void NumFormatException() {

		try {
			String text = "123.45";
			int number = Integer.parseInt(text);
			System.out.println(number);
		} catch(NumberFormatException s) {
			System.out.println("�������� " + s.getMessage());
		}
	
	}

	public void ExceptionExam() {
		
		try {
			int[] numbers = {1,2,3,4,5};
			int index = 7;
			int result = numbers[index];
			System.out.println(result);
		} catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("�迭 �ε��� ������ ��� ���ܰ� �߻�!!! " + e.getMessage());
		} catch(Exception e) {

			System.out.println("�迭 �ε��� ������ ��� ���ܰ� �ƴ� �Ϲ����� �ٸ� ���� �߻�" + e.getMessage());
		} finally {
			System.out.println("finally ����!");
		}
		System.out.println("���α׷��� ���� �Ǿ����ϴ�,");
	}
}
