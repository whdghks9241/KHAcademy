package com.kh.api.eaxm1;

public class StringBuilderMain {
/**
 	StringBuilder
 	���ڿ��� ȿ�������� ������ �� �ְ� ���ִ� Ŭ����
 	���ڿ��� ������ ������ ���ο� ���ڿ� ��ü�� �����ϴ� ���� �ƴ϶� ���� ���ڿ��� �����ϴ� ������� ����
 	�޸� ����� ȿ�����̰� �Ѵ�.
 */
	public static void main(String[] args) {
		StringBuilder strBuilder = new StringBuilder();
		
		// append �޼��带 ����Ͽ� ���ڿ� �߰�
		strBuilder.append("Hello, ");
		strBuilder.append("World");
		
		String result = strBuilder.toString();
		System.out.println(result);
		
		// ���ڿ� ����
		strBuilder.insert(7, "Java");
		System.out.println(strBuilder.toString());
		
		// ���ڿ� ����
		strBuilder.delete(7,11);
		System.out.println(strBuilder.toString());
		
		// ���ڿ� ��ü
		strBuilder.replace(7, 12, "AI �ְ��");
		System.out.println(strBuilder.toString());
		
		// ���ڿ� �������� �����
		strBuilder.reverse();
		System.out.println(strBuilder.toString());
		
	}
}
