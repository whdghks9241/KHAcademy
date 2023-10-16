package com.kh.variable;

public class Variable {

	public static void main(String[] args) {
		
		// 1. ������ �̸��� ������, ����, ������ھ�(_), �޷�($)�� ������ �� �ִ�.
		// 2. ���� �̸��� ���ڷ� ������ �� ����.
		// 3. ���� �̸� ���̿��� ������ ������ �� ����.
		// 4. ����� ��Ģ���ζ���� ���� ���� �����Ҷ� ����ϱ� ������ ������� �ʴ´�.
		// 5. �ڹٿ��� �̸� ������ ���� ���� �̸����� ������� ���Ѵ�,
		
		// �Ǽ��� (Float, double)
		float pie1 = 3.141332213123f; // float
		double pie2 = 3.141332213123;

		System.out.print("float : ");
		System.out.println(pie1);
		System.out.print("double : ");
		System.out.println(pie2);
		
		
		// byte : -128 ~ 127 ���� ��밡��
		// byte bt = -129; // int�� �����ϰų� byte + byte �� �־� ����Ѵ�.
		byte ht = 127; // -129�� 128�̻���� ����� ���� �ʴ°� Ȯ��
		
		// short = -32,768 ~ 32,767 ���� ��� ����
		// short shrt = -32768; // -32789�� 32768 ���� ����� ���� �ʴ´�. 
		short shrt = -32767;
		System.out.println(shrt);
		
		// int -2,147,483,648 ~ 2,147,483,647���� ��� ����
		int nt = -2147483648; // 
		System.out.println(nt);
		
		// long -9,223,372,036,854,775,808 ~  9,223,372,036,854,775,8087
		long lng = 2000L; //�ڿ� �빮��L�̳� �ҹ��� l �� �ֳ���,
		System.out.println(lng);
		long lng2 = 2000l; //�ڿ� �빮��L�̳� �ҹ��� l �� �ֳ���,
		System.out.println(lng2);
		
		
		// c?har : ������ ���ڸ� �ѹ��ڷ� ������ �� �ִ�.
		char chr1 = 'a';
		System.out.println(chr1);
	
		// S����
		// Boolea�� true�� false �� ǥ���Ѵ�
		// ����� boolean bin - true�� �����Ѵ�,.
		
		boolean bin = true;
		System.out.println(bin);

		boolean bin2 = false;
		System.out.println(bin2);
		
		// String�� �⺻���� ������ �⺻���� �ڷ����� ������ ������ �⺻������ ����
		// �⺻���� �ڷ����� ���� ������ ���� String���� ǥ����.
		// String ""�� ''�ȿ� ���ڸ� �־� �ۼ�.
		
		System.out.println("�ȳ��ϼ��� ���� ȫ�浿�Դϴ�.");
		String name = "ȫ�浿";
		System.out.println("�ȳ��ϼ��� . ���� " + name + "�Դϴ�");
		// �ѹ� Ÿ���� ������ ������ �� ������ ���� �ʰ� �״�� ����ص� ��������
		// �ѹ� ������ Ÿ���� �ٸ� Ÿ������ �缱�� �� �� ����
		// ������ Ÿ���� �ٸ� Ÿ������ �����ؼ� ����� �� ����.
		name = "��ö��";
		System.out.println("�ȳ��ϼ��� . ���� " + name + "�Դϴ�");

		int age = 22;
		String baseball = "�߱�";
		System.out.println("�ȳ��ϼ���. ���� " + name + "�Դϴ�.");
		System.out.println("���� ���̴� " + age + "�� �̰�.");
		System.out.println("���� ��̴� " + baseball + "�Դϴ�.");
	
		char score = 'a';
		System.out.println("���� ������ " + score + "�Դϴ�");
	
	}
}
