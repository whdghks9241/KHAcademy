package com.kh.exceptionSample;

public class ExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		try {
//			int result = 10 / 0;
//		} catch (ArithmeticException e) {
//			/**
//			ArithmeticException �������� ��� �������� �߻��� ����
//			ArithmeticException e : e�� �츮�� ������ ������
//			e�� ������ ������ �޽����� getMessage() �� �����Ѵ�.
//			 */
//			System.out.println("��� �������� ���� �߻��� ����!! " + e.getMessage());
//
//		}	
		
		ExceptionMain em  = new ExceptionMain();
		em.Excepation3();
	}
	
	public void Exception1() {
		try {
			int result = 10 / 0;
		} catch (ArithmeticException e) {
			
			System.out.println("��� �������� ���� �߻��� ����!! " + e.getMessage());

		}	
	}
	
	public void Exception2() {

		try {
			
			String text = null;
			
			int length = text.length();
			
			System.out.println("���� ���� : " +  length);
		
		} catch (NullPointerException abc ) {
			System.out.println("���� ����!! " + abc.getMessage());

		}	
		
	}
	
	public void Excepation3() {
		
		
		try {
			String junnNumber =  "�����ȿ�";
			int num = Integer.parseInt(junnNumber); // ���ڿ� �����κ�ȯ��
		} catch (NumberFormatException a) { // �ȿ� String ������ ��ȯ
			System.out.println("���� �Է� ��!!!");
			
		} 
	
	}

}
