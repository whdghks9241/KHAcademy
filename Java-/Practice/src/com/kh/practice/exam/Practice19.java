package com.kh.practice.exam;

import java.util.Scanner;

public class Practice19 {

	public static void main(String[] args) {
		/*
			����ڰ� �迭�� ���̸� ���� �Է��Ͽ� �� ����ŭ ������ �迭�� ���� �� �Ҵ��ϰ�
			�迭�� ũ�⸸ŭ ����ڰ� ���� ���� �Է��Ͽ� ������ �ε����� ���� �ʱ�ȭ �ϼ���.
			�׸��� �迭 ��ü ���� �����ϰ� �� �ε����� ����� ������ ���� ����ϼ���.
			ex.
			���� : 5
			�迭 0��° �ε����� ���� �� : 4
			�迭 1��° �ε����� ���� �� : -4
			�迭 2��° �ε����� ���� �� : 3
			�迭 3��° �ε����� ���� �� : -3
			�迭 4��° �ε����� ���� �� : 2
			4 -4 3 -3 2 
			�� �� : 2
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int[] intArray = new int[5];
		intArray[0] = 4;
		intArray[1] = -4;
		intArray[2] = 3;
		intArray[3] = -3;
		intArray[4] = 2;
		
		int sum = 0;
		
		for (int i = 0; i <intArray.length; i++) {
			sum += intArray[i];
			System.out.print(intArray[i] + " ");
		}
		System.out.println("");
		System.out.println("�� �� : " + sum);
	}

}
