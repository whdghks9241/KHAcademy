package com.kh.practice;

import java.util.Scanner;

public class practice {
	
	public static void main(String[] args) {
		
		int choice;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("�ǽ������� �������ּ���");
			System.out.print("1. practice1		");
			System.out.print("2. practice2		");
			System.out.print("3. practice3		");
			System.out.println("4. practice4		");
			
			choice = sc.nextInt();
			
			switch(choice) {
			case 1 :
				practice1();
				break;
			case 2 :
				practice2();
				break;
			case 3 :
				practice3();
				break;
			case 4 :
				practice4();
				break;
			default :
				System.out.println("�ٽ� �Է����ּ���");
				break;
			}
		}
		
	}

	public static void practice1() {
		/**
		    �Ʒ� ���ÿ� ���� �޴��� ����ϰ� �޴� ��ȣ�� ������ ��OO�޴��Դϴ١���,
			���� ��ȣ�� ������ �����α׷��� ����˴ϴ�.���� ����ϼ���.
			ex.
			1. �Է�
			2. ����
			3. ��ȸ
			4. ����
			7. ����
			�޴� ��ȣ�� �Է��ϼ��� : 3
			��ȸ �޴��Դϴ�
		 */
	
		int choice;
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("�޴��� ������ �ּ���");
		System.out.print("1. �Է�		");
		System.out.print("2. ����		");
		System.out.print("3. ��ȸ		");
		System.out.print("4. ����		");
		System.out.println("7. ����	");
		
		choice = sc.nextInt();
		
		// 1. if��
		if (choice == 1) {
			System.out.println("�Է� �޴��Դϴ�.");
		} else if (choice == 2) {
			System.out.println("���� �޴��Դϴ�.");
		} else if (choice == 3) {
			System.out.println("��ȸ �޴��Դϴ�.");
		} else if (choice == 4) {
			System.out.println("���� �޴��Դϴ�.");
		} else if (choice == 7) {
			System.out.println("���α׷��� ����˴ϴ�.");
		}
		
		// 2. switch
		switch(choice) {
			case 1 :
				System.out.println("�Է� �޴��Դϴ�.");
				break;
			case 2 :
				System.out.println("���� �޴��Դϴ�.");
				break;
			case 3 :
				System.out.println("��ȸ �޴��Դϴ�");
				break;
			case 4 :
				System.out.println("���� �޴��Դϴ�.");
				break;
			case 7 :
				System.out.println("���α׷��� ����˴ϴ�.");
				break;
		}
	}
	
	
	public static void practice2() {
		/**
		 	Ű����� ������ �Է� ���� ������ ����̸鼭 ¦���� ���� ��¦���١��� ����ϰ�
			¦���� �ƴϸ� ��Ȧ���١��� ����ϼ���.
			����� �ƴϸ� ������� �Է����ּ���.���� ����ϼ���.
		 */
		int insertNumber;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �� �� �Է����ּ���");
		insertNumber = sc.nextInt();
		
		if (insertNumber <= 0) {
			System.out.println("����� �Է����ּ���");
		} else if ((insertNumber % 2) == 0) {
			System.out.println("¦����");
		} else {
			System.out.println("Ȧ����");
		}
	}
	
	
	public static void practice3() {
		
		int koranScore, mathScore, englishScore, totalScore;
		
		double averageScore;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���������� �Է����ּ���");
		koranScore = sc.nextInt();
		System.out.println("���������� �Է����ּ���");
		mathScore = sc.nextInt();
		System.out.println("���������� �Է����ּ���");
		englishScore = sc.nextInt();
		
		totalScore = koranScore + mathScore + englishScore;
		averageScore = totalScore / 3;
		if (averageScore < 60) {
			System.out.println("���հ��Դϴ�.");
		} else {
			System.out.println("���� : " + koranScore);
			System.out.println("���� : " + mathScore);
			System.out.println("���� : " + englishScore);
			System.out.println("�հ� : " + totalScore);
			System.out.println("��� : " + averageScore);
			System.out.println("�����մϴ�, �հ��Դϴ�!");
			
		}		
	}
	
	
	public static void practice4() {
		// ��, ����, ����, �ܿ� ������ switch������ �ٲ㼭 ����ϼ���
		int month;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 ~ 12 ������ ������ �Է����ּ���");
		month = sc.nextInt();
		
		switch(month) {
			case 1 : case 2 : case 12 :
				System.out.println(month + "���� �ܿ� �Դϴ�");
				break;
			case 3 : case 4 : case 5 :
				System.out.println(month + "���� �� �Դϴ�");
				break;
			case 6 : case 7 : case 8 :
				System.out.println(month + "���� ���� �Դϴ�");
				break;
			case 9 : case 10 : case 11 :
				System.out.println(month + "���� ���� �Դϴ�");
				break;
		}
	}
	
}
