package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {

	public static void main(String[] args) {

		/**
		 * Ű����� ����, ���� ���� ���� �Ǽ������� �Է� �޾� �簢���� ������ �ѷ��� ����Ͽ� ����ϼ���.
		   ��� ���� ) ���� : ���� * ����
	       �ѷ� : (���� + ����) * 2
		 */
		
		Scanner sc = new Scanner(System.in);
		
		//���α���, ���α���
		double width, length;
		
		System.out.println("������ ���̴� ? ");
		width = sc.nextDouble();

		System.out.println("������ ���̴� ? ");
		length = sc.nextDouble();
		
		System.out.println("�簢���� ������ " + (width * length) + " �Դϴ�");
		System.out.println("�簢���� �ѷ��� " + ((width + length) * 2) + " �Դϴ�");
	}
}



