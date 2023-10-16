package com.kh.genericsMain;

public class GenericsExam {

	public static void main(String[] args) {
		// ������ �����͸� �����ϴ� Box �ν��Ͻ� ����
		Book<Integer> intBook = new Book<>();
		intBook.put(42);
		intBook.put(16478);
		
		int intValue =intBook.get(); // ����ȯ�� �ʿ� ����.
		
		// ���ڿ� �����͸� �����ϴ� Book �ν��Ͻ� ����
		Book<String> strBook = new Book<>();
		strBook.put("���m");
		strBook.put("��������");
		strBook.put("�������R���R");
		strBook.put("���忡�쿨");
		strBook.put("���m����");
		
		String strValue = strBook.get(); // ����ȯ �� �ʿ� ����
		
		// ���ʸ� Ŭ������ ����ؼ� �پ��� ������ ������ ó���� �� �ְ� ����Ҽ� ����
		System.out.println("Int Value  :  " + intValue);
		System.out.println("String Value  :  " + strValue);
	}
}
