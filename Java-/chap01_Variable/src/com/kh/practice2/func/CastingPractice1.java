package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	public static void main(String[] args) {
		// Ű����� ���� �ϳ��� �Է� �޾� �� ������ ���ڸ� ����ϼ���
		char character;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է����ּ���(A~Z/a~z)");
		character = sc.next().charAt(0);
		
		int changeIntcahr = character;
		System.out.println("�Է¹��� : " + character + " / unicode : " + changeIntcahr);
		
	}
}
