package com.kh.sithchsample;

import java.util.Scanner;

public class SwitchScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean ischoice = false;

		while (!ischoice) { // �ʱ� ���°� false - while�� ���� �� ����
			// Scanner�� �̿��ؼ� ���ڸ� �����ϴ� switch�� �����
			System.out.println("���ϴ� ���ڸ� �������ּ���");
			System.out.print("1. �����	");
			System.out.print("2. ĭ��	");
			System.out.println("3. ���̽�	");
			
			int choice = sc.nextInt();
			switch(choice) {
			case 1 :
				System.out.println("������� �����ϼ̽��ϴ�.");
				ischoice = true;
				break;
			case 2 :
				System.out.println("ĭ�ݸ� �����ϼ̽��ϴ�");
				ischoice = true;
				break;
			case 3 :
				System.out.println("���̽��� �����ϼ̽��ϴ�");
				ischoice = true;
				break;
			default :
				System.out.println("�߸��� �����Դϴ�. �ٽ� �������ּ���");

			}
		}

		
//		System.out.println("������ �������ּ���");
//	
//		System.out.print("1. ���		");
//		System.out.println("2. ����	");
//		int fruit = sc.nextInt();
//		switch(fruit) {
//			case 1 :
//				System.out.println("���");
//				break;
//			case 2 :
//				System.out.println("����");
//				break;
//			default : 
//				System.out.println("�߸��� �����Դϴ�");
//		}
//		
		
		
//		System.out.println("�ֹ��Ͻ� ��ȣ�� ������ �ּ���.");
//		System.out.print("1. �Ƹ޸�ī��	");
//		System.out.print("2. ������Ƽ	");
//		System.out.print("3. ī���	");
//		System.out.println("4. ���ν����");
//		int choice = sc.nextInt();
//		
//		switch(choice) {
//			case 1:
//				System.out.println("�Ƹ޸�ī�븦 �ֹ��ϼ̽��ϴ�");
//				break;
//			case 2:
//				System.out.println("������Ƽ�� �ֹ��ϼ̽��ϴ�");
//				break;
//			case 3:
//				System.out.println("ī��󶼸� �ֹ��ϼ̽��ϴ�");
//				break;
//			case 4:
//				System.out.println("���ν���ʸ� �ֹ��ϼ̽��ϴ�");
//				break;
//			default :
//				System.out.println("�߸��� �����Դϴ�. �ٽ� �ֹ����ּ���");
//		}
		
	}
}
