package com.kh.Operator;

public class Ternary {

	public static void main(String[] args) {
		
		// 6. ���� ������
		/*
		 ���� = ���� ? ���� : ����;
		 ������ ���ϰ� �� ���� �� �� �ϳ��� ��ȯ��.
		 ���� ? ��1 : ��2 ���·� ���
		 ���� ? ��1(true) : ��2(false)
		 �� 1�� ������ ���� �� ���
		 �� 2�� ������ ������ �� ���
		 */
		// ex) ���̰� 20�̻��� �����ΰ� �̼������ΰ�
		int age = 20;
		String status = (age >= 20) ? "����" : "û�ҳ�";
		System.out.println(status);
		
		int score = 85;
		String result = (score >= 60) ? "�հ�" : "���հ�";
		System.out.println("���� ��� : " + result);
		
		int namber = -5;
		String sign = (namber > 0) ? "true" : "false";
		System.out.println("sign : " + sign);
		
		int temperature = 25;
		String weather = (temperature > 21) ? "������ ����" : "�߿� ����";
		System.out.println("���� ���� : " + weather);
		
		// ���� 7�� ���� ¦������ Ȧ�� ���� ���
		int value = 7;
		String valueCheck = ((value % 2) == 0) ? "¦��" : "Ȧ��";
		System.out.println("���� : " + valueCheck);
		
		
		int number2 = -5;
		String sign2 = (number2 > 0) ? "���" : (number2 < 0) ? "����" : "0";
		System.out.println("������ ��ȣ : " + sign2);

	}
}
