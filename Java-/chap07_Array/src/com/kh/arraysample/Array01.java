package com.kh.arraysample;

import java.util.Scanner;

public class Array01 {
	public static void main (String[] args) {
		
		// Array
		// ���� Ÿ���� ���� ������ �ϳ��� �������� �ٷ�� ��
		/**
		 ������ ������ Ÿ���� ���� ���� ���� �� ���� �����ϰ�
		 �ε����� ����Ͽ� �� ���� ������ �� �ֵ��� ����
		 �迭�� ���α׷����� �����͸� ���� ȿ�������� �����ϰ� �����ϴµ� ���
		 �������� ������ ���� �ٷ� �� �ֵ��� ������
		 
		 �迭�� ����
		 	�迭 ���� �� �ʱ�ȭ
		 	������Ÿ��[] �迭�̸� = new ������Ÿ��[ũ��];
		 
		 Ư¡ : 
		 	1. ������ ũ�� : ������ �� ũ�Ⱑ �����ǰ�, ũ�Ⱑ ����������
		 				���� �� ũ�⸦ ������ �� ����
		 	
		 	2. ���� ������ Ÿ�� : �迭 ���� ��� ��Ҵ� ������ ������ Ÿ���� ������ �Ѵ�.
		 					ex) int Ÿ���� �迭�� ��� ��� ����
		 					
		 	3. index ��� ���� : �� �迭 ��Ҵ� �������� �ε����� ������ 0���� �����ؼ� �迭ũ�� -1������ ���� ����
		 					  �ε����� ����ؼ� Ư�� ��ġ�� �ִ� ��� ���� ����
		 					  ex) �迭ũ�� = 5�� �Z�ٸ� index�� 0 ���� 4����
		 					  
		 	4. �迭�� ����(length) : �迭�� ���̸� �� �� �ִ�.
		 	
		 */
		
//		int score1, score2, score3, score4, score5;
//		
//		// int Ÿ���� �迭�� ����
//		int[] score = new int[4];
//
//		score[0] = 1;
//		score[1] = 2;
//		score[2] = 3;
//		score[3] = 4;
//		
//		System.out.println(Arrays.toString(score));
//		
//		Scanner sc = new Scanner(System.in);
//		int[] arr = new int[5];
//		//  index 0~4���� �����
//		// �迭�� int 5���� ����
//		for(int i = 0; i < 5; i++) {
//			arr[i] = sc.nextInt();
//			System.out.println(arr[i]);
//		}
//		
//		String[] nameArray = {"��߳�", "�踻��", "ȫ�浿"};
//
//		String[] stringArray = new String[4];
//		stringArray[0] = "��";
//		stringArray[1] = "��";
//		stringArray[2] = "��";
//		stringArray[3] = "��";
//		System.out.println("stringArray : " + stringArray[0]);
//		System.out.println("stringArray : " + stringArray[1]);
//		System.out.println("stringArray : " + stringArray[2]);
//		System.out.println("stringArray : " + stringArray[3]);
		
		String[] food = {"����", "����", "����", "����"};
		System.out.println("stringArray : " + food[0]);
		System.out.println("stringArray : " + food[1]);
		System.out.println("stringArray : " + food[2]);
		System.out.println("stringArray : " + food[3]);
		System.out.println("stringArray : " + food.length);
	}
}
