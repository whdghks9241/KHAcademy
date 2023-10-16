package com.kh.objExam;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PracticeMain4 {
	public static void main(String[] args) {
		
		PracticeMain4 p4 = new PracticeMain4();
	
		p4.practice1();
		p4.practice2();
		p4.practice3();
		p4.practice4();
	}

	public void practice1() {
//		Scanner sc = new Scanner(System.in);
		String name = "Hwan";
		int age = 31;
		String formatString = String.format("�̸� : %s  ���� : %d", name, age);
		
		System.out.println(formatString);
	}

	public void practice2() {
		
		Date currentDate = new Date();
		SimpleDateFormat smDateFormate = new SimpleDateFormat("yyyy-MM-dd");
		
		String formatStr = String.format("���� ��¥ : %s", smDateFormate.format(currentDate));
		System.out.println(formatStr);
	} 
	
	public void practice3() {
		int num1 = 123;
		int num2 = 7;
		
		// ���ڰ� ������ ���̺��� ª�� ��� �տ� 0���� ä���ְڴ�.
		// ��µǴ� ������ �ּ� �ʺ� �ڸ� 5�ڸ��� �ϰ�ʹ�
		// String ������ = String.format(�������)`;
		String formatInt = String.format("���� 1 : %d   ���� 2 : %d", num1, num2);
		System.out.println(formatInt);

	}

	public void practice4() {
		String text1 = "Hello";
		String text2 = "World";

		// 10�� �ּ� �ʺ� �ּ� 10�ڸ��� ������ ����
		// ���� ���ڿ���  10�ڸ����� ª�ٸ�  ���ʿ� �������� ä����
		// ���� ���ڿ��� -10�ڸ����� ª�ٸ� �����ʿ� �������� ä����
		// ' ����ǥ�� �ѷ��׿�����.
		String foramtStr = String.format("%-10s %10s", text1, text2);
		System.out.println(foramtStr);

	}
}
