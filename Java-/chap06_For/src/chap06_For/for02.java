package chap06_For;

import java.util.Scanner;

public class for02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
//		int number1 = sc.nextInt();
//		
//		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
//		int number2 = sc.nextInt();
//		
//		int result = 0; // ���� ���� 0���� �ش�.
//		for (int i = 0; i < number2; i++) { // for ������ ����ؼ� i ������ 0 ���� number2 �̸����� �ݺ�
//											// �� ������ �ι�° ������ num2 ��ŭ �ݺ�
//			result += number1;
//			// result ������ number1 ���� ����
//			// number2 ��ŭ number1�� ���ؼ� ȿ���� ��
//			System.out.println(number1 + " * " + number2 + " = " + result);
//		}
//		System.out.println(number1 + " * " + number2 + " = " + result);
//		// ���� ����� ��� �Է� ���� �� ���ڿ� ��� ���� ���ڿ��� ���
		
		int result = 0;
//				
//		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
//		int num1 = sc.nextInt();
//		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
//		int num2 = sc.nextInt();
//		
		// ���� for���� �̿��� ������
		for (int i = 2; i < 10; i++) {
			
			for (int j = 1; j < 10; j++) {
				
				System.out.println( i + " * " + j + " = " + (i * j));
				
			}
		}			
	}
}
