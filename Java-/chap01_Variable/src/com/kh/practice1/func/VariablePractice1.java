package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	public static void main(String[] args) {
		/**
		 * 		�̸�, ����, ����, Ű�� ����ڿ��� �Է� �޾� ������ ���� ������ ��� ����ϼ���.
		 */
		String name, gender;
		int age;
		double stature;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������� �̸��� �Է����ּ���.");
		name = sc.next();
		
		System.out.println("������� ������ �Է����ּ���(��/��)");
		gender = sc.next();
		
		System.out.println("������� ���̸� �Է����ּ���.");
		age = sc.nextInt();
		
		System.out.println("������� Ű�� �Է����ּ���(cm)");
		stature = sc.nextDouble();
		

		System.out.println("Ű " + stature + "cm�� " + age + "�� " + gender + " " + name +"��");
	}	
}
