package com.kh.api.eaxm1;

public class WrapperMain {

	/**
	 Wrapper �⺻ ������ ������ ��ü�� ����(Wrap) ��ü�� �۾��� �� ����
	 		Ŭ�����δ� Integer, Double, Boolean ���� ����
	 */
	public static void main(String[] args) {
		Integer num = 40;
		System.out.println("������ : " + num);
	
		// Wrapper Ŭ������ �⺻ ������ �������� ��ȯ
		int intValue = num.intValue();
		System.out.println("�⺻ ������ ���� �� : " + intValue);
		
		Double pi = 3.3436236423462363;
		// ���� ���� ���
	
		double radius = 5.0;
		double area = pi * Math.pow(radius, 2);
		
		System.out.println("���� ���� :  " + area);
		
		// ���ڿ��� �Ǽ��� ��ȯ
		String numStr = "3.14";
		Double parsedDouble = Double.parseDouble(numStr);
		
		// parseDouble String ���ڿ� �����͸� ����, �Ҽ��� ��ȯ�ϰڴ�.
		System.out.println("���ڿ��� �Ǽ��� ��ȯ�� �� : " + parsedDouble);
		
		
		// Boolean Wrapper Ŭ���� �����
		Boolean isJavaFun = true;
		
		// ���ǹ� Ȱ��
		if (isJavaFun) {
			System.out.println("��� �ڹ� ����ִ�");
		} else {
			System.out.println("�ڹ� �쿢!");
		}
		
		String boolstr = "true";
		Boolean parsBool = Boolean.parseBoolean(boolstr);
		
		System.out.println("���ڿ��� �Ҹ������� ��ȯ�� �� : " + parsBool);
	}
}
