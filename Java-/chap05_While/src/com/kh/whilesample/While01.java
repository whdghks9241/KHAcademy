package com.kh.whilesample;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean isTrue = true;

		
		while(isTrue) { // isTrue = true �̱� ������ true ��� isTrue ���
			System.out.println("Ŀ�Ǹ� �ֹ����ּ���. 		1. �Ƹ޸�ī��	2. ī���	3. ���̽�����");
			int choice = sc.nextInt(); // while ������ �̵�
			
			switch(choice) {
				case 1 :
					System.out.println("�Ƹ޸�ī�� �ֹ�!");
					isTrue = false; // �Ƹ޸�ī�� �ֹ��� �޾����� while���� �����ϱ����� boolean ���� false�� �����Ѵ�.
					break;
				case 2 :
					System.out.println("ī��� �ֹ�!");
					isTrue = false;
					break;
				case 3 :
					System.out.println("���̽����� �ֹ�!");
					isTrue = false;
					break;
				default :
					System.out.println("�� �ֹ� �߸���");
			}
		}
	}
}
