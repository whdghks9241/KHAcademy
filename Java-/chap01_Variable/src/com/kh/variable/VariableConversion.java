package com.kh.variable;

public class VariableConversion {

	public static void main(String[] args) {
		// 1. �ڵ� ����ȯ (�Ͻ��� ����ȯ, ������ ����ȯ)
		int intNum= 100;
		System.out.println(intNum); // ���� 100�� �ǹ�
		long longNum = intNum; // int�� long ���� �ڵ� ����ȯ
		System.out.println(longNum); 
		
		float floatNum = 3.14f;
		double doubleNum = floatNum; // float �� double�� �ڵ�����ȯ
		
		// int -> long �����ϴ� ����ȯ (2����) ����� ���
		// 1.
		int changeIntlong = 500;
		System.out.println("changeIntlong : " + changeIntlong); 
		long changeLongint = changeIntlong;
		System.out.println("changeLongint : " + changeLongint); 
		// 2.
		int chanegIntlong2 = -500;
		System.out.println("chanegIntlong2 : " + chanegIntlong2); 
		long changeLongint2 = chanegIntlong2;
		System.out.println("changeLongint2 : " + changeLongint2); 
		
		// short -> int �����ϴ� ����ȯ (1����) ����� ���
		// 1.
		short changeShortint = 30;
		System.out.println("changeShortint : " + changeShortint); 
		int changeintShort = changeShortint;
		System.out.println("changeintShort : " + changeintShort); 
		
		// float -> double �����ϴ� ����ȯ (1����) ����� ���
		float changeFloatdouble = 5.1389f;
		System.out.println("changeFloatdouble : " + changeFloatdouble); 
		double changeDoublefloat = changeFloatdouble;
		System.out.println("changeDoublefloat : " + changeDoublefloat); 
	
	
	
		// 2. ����� ����ȯ(���� ����ȯ)
		long largeLong = 123456789012345L;
		System.out.println("largeLong : " + largeLong);
		int largeInt = (int)largeLong;
		System.out.println("largeInt : " + largeInt); // long�� int�� ���� ����ȯ �� ��� ���� �������� ���� ������ �Ϻ� �����ʹ� �սǵȴ�.
		
		double largeDouble1 = 12345.67889;
		int inPart = (int)largeDouble1;
				
				
		// ���ڿ� ���� ���� ����ȯ 2�� ���
		// ���ڴ�char charbale 
		char changCharint = 'Z';
		int changeIntcahr = changCharint;
		System.out.println("changeIntcahr : " + changeIntcahr);
		
		char changCharint2 = 'A';
		int changeIntcahr2 = changCharint2;
		System.out.println("changeIntcahr2 : " + changeIntcahr2);
		
		// double -> int �� ����ȯ �� Ȯ��
		double changedoubleint = 123.203;
		int changIntdouble = (int) changedoubleint;
		System.out.println("changIntdouble : " + changIntdouble);
		
		// int�� short�� ����ȯ 1�� ���
		int changeIntshort = 3333;
		short changShortint = (short) changeIntshort;
		System.out.println("changShortint : " + changShortint);
	}
	
	
	
}
