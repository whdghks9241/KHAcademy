package com.kh.practice.exam;

import java.util.Scanner;

public class Practice20 {

	public static void main(String[] args) {
		/*
		3�̻��� Ȧ�� �ڿ����� �Է� �޾� �迭�� �߰������� 1���� 1�� �����Ͽ� ������������ ���� �ְ�,
		�߰� ���ĺ��� �������� 1�� �����Ͽ� ������������ ���� �־� ����ϼ���.
		��, �Է��� ������ Ȧ���� �ƴϰų� 3 �̸��� ��� ���ٽ� �Է��ϼ��䡱�� ����ϰ�
		�ٽ� ������ �޵��� �ϼ���.
		ex.
		���� : 4
		�ٽ� �Է��ϼ���.
		���� : -6
		�ٽ� �Է��ϼ���.
		���� : 5
		1, 2, 3, 2, 1
		*/
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("3�̻��� Ȧ���� �Է����ּ���");
		int inputNum = sc.nextInt();
		int[] intArray = new int[inputNum];
		
		if (inputNum < 3 || inputNum%2 == 0) {
			System.out.println("�ٽ� �Է��ϼ���");
		} else {
			// �迭�� �ѱ���
			for (int i = 0; i < inputNum; i++) {

				if ( i < ((inputNum / 2) + 1)) {
					intArray[i] = num++;
					
					System.out.print(num);
				}
				else if (i >= ((inputNum / 2) + 1)) {
					intArray[i] = num--;
					
					System.out.print(num);
				}
			}
		}
	}
}
