package com.kh.api.eaxm1;

public class FormatterMain {

	/**
	 	Formatter : ���ڿ��� ����ȭ �ϴµ� ���Ǵ� Ŭ����
	 	�ؽ�Ʈ ����� ���ϴ� ���Ŀ� �°� �������ϰ� ���� �� �����ϰ� ���
	 	
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Hwan";
		
		int age = 31;
		
		double salary = 50000.56;
		
		// Formatter ����Ͽ� ���ڿ��� ����ȭ 
		// ���� : %.2f = �Ҽ��� 2�ڸ����� ��Ÿ���ٴ� �ǹ�
		String formatString = String.format("�̸� : %s, ���� : %d ���� : %.2f", name, age, salary);
		
		// ����ȭ�� ���ڿ� ���
		System.out.println(formatString);
	}
}
