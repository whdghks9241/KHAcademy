package com.kh.api.eaxm1;
/**


 */
public class StringBufferMain {
	public static void main(String[] args) {
		// �� StringBuffer ��ü ����
		StringBuffer sb = new StringBuffer();
		
		// ���ڿ� �߰�
		sb.append("Hello, " );
		sb.append("JAVA " );
		sb.append("StringBuffer");
		
		System.out.println(sb.toString());
		
		// ���ڿ� ����
		sb.insert(6, "Eclipse");
		System.out.println(sb.toString());
	
		// ���ڿ� ��ü
		sb.replace(13, 17, "WOW");
		System.out.println(sb.toString());
		
		// ���ڿ� ����
		sb.delete(13, 20);
		System.out.println(sb.toString());
		
		// ���ڿ� ������
		sb.reverse();
		System.out.println(sb.toString());
	}
}
