package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {

	public static void main(String[] args) {
		
		String eString;
		// ���� ���ڿ� ���� Ű����� �Է� �޾� ���ڿ��� �տ��� �� ���� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		
		// 1��
		System.out.println("���� ���ڿ��� �Է����ּ���");
		eString = sc.next();
		
		System.out.println("���ڿ��� ù �ܾ�� " + eString.charAt(0)  + " �Դϴ�");
		System.out.println("���ڿ��� �ι�° �ܾ�� " + eString.charAt(1)  + " �Դϴ�");
		System.out.println("���ڿ��� ����° �ܾ�� " + eString.charAt(2)  + " �Դϴ�");

		
		// 2��
		System.out.println("���� ���ڿ��� �Է����ּ���");
		eString = sc.next();

		System.out.println("���ڿ��� ù �ܾ�� " + eString.substring(0,1) + " �Դϴ�");
		System.out.println("���ڿ��� �ι�° �ܾ�� " + eString.substring(1,2) + " �Դϴ�");
		System.out.println("���ڿ��� ����° �ܾ�� " + eString.substring(2,3) + " �Դϴ�");
		
	}
}