package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	public static void main(String[] args) {
		// �Ǽ���(�Ҽ���)���� ����, ����, ���� �� ������ ������ �Է� �޾� ������ ����� ����ϼ���.
		// �� �� ������ ����� ���������� ó���ϼ���.
		
		double korean, english, math;
		int averageScore, totalScore;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���������� �Է����ּ���");
		korean = sc.nextDouble();
		
		System.out.println("���������� �Է����ּ���");
		english = sc.nextDouble();
		
		System.out.println("���������� �Է����ּ���");
		math = sc.nextDouble();
		
		averageScore = (int) (korean + english + math);
		totalScore = (averageScore/3);
		System.out.println("���������� " + korean + " �Դϴ�.");
		System.out.println("���������� " + english + " �Դϴ�.");
		System.out.println("���������� " + math + " �Դϴ�.");
		System.out.println("������ " + averageScore + " �Դϴ�.");
		System.out.println("��������� " + totalScore + " �Դϴ�.");
	}
}
