package com.kh.arraysample;

import java.util.Scanner;

public class Array03 {

	public static void main (String[] args) {
		/**
		 ���ڿ��� �Է¹޾Ƽ� ���� �ϳ��ϳ� �迭�� �ְ� �˻��� ���ڰ� ���ڿ��� �� �� �� �ִ��� ������ ���° �ε����� ��ġ�ϴ��� �ε��� �������
		 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ��� �Է����ּ���");
		
		String inputString = sc.next();
	
		System.out.println("�˻��� ���ڸ� �Է��ϼ���");
		char searchChar = sc.next().charAt(0);
	
		// toCharArray -> ���ڿ��� ���� �迭�� ��ȯ�ϴ� ����
		// ���ڿ��� -> ���ڷ� ��ȯ;
		char[] charString = inputString.toCharArray();

		// �˻��� ���ڰ� 
		// ���ڿ��� �� �� �� �ִ��� ������ -> length
		int charCount = charString.length;
		
		// �ߺ��� ���� ����
		int count = 0;
		
		// �� ��° �ε����� ��ġ�ϴ��� �ε��� ����ϱ� -> �ε��� üũ
		for (int i = 0; i < charCount; i++) {
		
			// �ݺ����� ���� ���� array�� ��� ������ �˻��� ���ڿ� �����Ѱ� �ִ��� üũ
			if (charString[i] == searchChar) {
				System.out.println("index : " +  i);
				// ������ ���ڰ� �ִٸ� ��� ����ִ��� üũ�ϱ����� ī��Ʈ ����
				count++;
			}
		}
		
		System.out.println(searchChar + " ��� �ܾ��  " +  count + "�� �ֽ��ϴ�.");
		
	}
}