package com.kh.scannersample;
import java.util.Scanner;

public class ScannerSample {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name, hobby, food, address;
		String phoneNumber;
		
//		System.out.println("���̸� �Է� ���ּ���.");
//		int age = sc.nextInt(); // �������� �޴� next
//
//		System.out.println("�� ���̴� " + age + " �� �Դϴ�.");
//				
//		System.out.print("����� �̸��� �Է��ϼ��� : ");
//		name = sc.next();
//		System.out.print("����� ��ȭ��ȣ�� �Է��ϼ��� : ");
//		phoneNumber = sc.next(); // -���� �ʱ�
//		
//		
//		System.out.println("����� �̸��� " + name + " �Դϴ�");
//		System.out.println("����� ��ȭ��ȣ�� " + phoneNumber + " �Դϴ�");
//		
		
		
		// �� ��̿� ���� �����ϴ� ���İ� �� �ּ� ����ϱ�
		System.out.println("����� ��̸� �Է��ϼ���");
		hobby = sc.next();
		System.out.println("����� �����ϴ� ������ �Է��ϼ���");
		food = sc.next();
		System.out.println("����� �ּҸ� �Է��ϼ���");
		sc.nextLine(); // sc.nextLine() �ϱ� ��, sc.nextLine() �� �ѹ� �� �ۼ��Ͽ� �Է¹��۸� ����ش�.
		address = sc.nextLine(); // ����ġ�� ������ ���
		
		System.out.println("����� ��̴� " + hobby + " �Դϴ�");
		System.out.println("����� �����ϴ� ������ " + food + " �Դϴ�");
		System.out.println("����� �ּҴ� " + address + " �Դϴ�");
	}
}
