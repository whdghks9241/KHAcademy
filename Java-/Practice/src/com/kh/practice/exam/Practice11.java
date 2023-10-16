package com.kh.practice.exam;

import java.util.Scanner;

public class Practice11 {
	public static void main(String[] args) {
		
		/**
		 * 2���� ����ڰ� �Է��� �������� �Ҽ��� ��� ����ϰ� �Ҽ��� ������ ����ϼ���.
			��, �Է��� ���� 2���� ���� ��� ���߸� �Է��ϼ̽��ϴ�.���� ����ϼ���.
		 */
		Scanner sc = new Scanner(System.in); // �Է¹ޱ� ���� �ҷ����� �޼ҵ�
		 
		System.out.println("���ڸ� �Է����ּ���"); // ��� �޼ҵ�
		
		int num = sc.nextInt();
		int num2= 1;
		
		// �Ҽ����� �ƴ��� üũ�ϴ� boolean 
		boolean primeNum = true;
		 
		if (num < 2) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		} else {
			// �Ҽ��� ��� 1�� �ڱ��ڽŸ���� ������ �������� ���� ������Ѵ�.
			for(int i=2; i <= num; i++) {
				/**
				  i - 1 �� �ؾ� �Ұ�� a * a ��� �־��
				  
				   sqrt(i) i�� �������� ��Ÿ���� �Լ�
				   sqrt(i) ����� 4���� 16�� �������� 4�� ��
				   �Ҽ��Ǻ� sqry(i) �Ҽ��� �Ǻ��� �� i �Ҽ����� Ȯ���ϱ� ���� 2���� sqrt(i)
				   ��귮�� ���̰� ȿ�������� �Ҽ��� �Ǻ��� �� ����
 				 */
	            for(int j=2; j*j <= i; j++){
	                if(i % j == 0){
	                    // �Ҽ��� �ƴ�
	                	primeNum = false;
	                    // �Ҽ��� �ƴ� ����
	                    num2++;
	                    break;
	                }
	            }
	            if(primeNum){
	                // �Ҽ� �϶��� ���� ���
	                System.out.print(i+" "); 
	            }
	            primeNum = true;
	        }

            System.out.print("�Ҽ� �� ���� : " + (num - num2));
		}
	}
}
