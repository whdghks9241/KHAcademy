package com.kh.objExam;

public class PracticeMain2 {		// �� StringBuffer ��ü ����
	
	String str = "���� ������ ������";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeMain2 main2 = new PracticeMain2();
		main2.practice1();
		main2.practice2();
		main2.practice3();
		main2.practice4();
		main2.practice5();

	}

	public void practice1() {

		StringBuffer sb = new StringBuffer();
		// ���ڿ� �� ���̱� ��� append
		sb.append("���� ");
		sb.append("������ ");
		sb.append("�� ");
		sb.append("���� ");
		
		System.out.println("�� �� : " + sb.toString());
	}

	public void practice2() {
		StringBuffer sb = new StringBuffer(str);
		// ���ڿ� ������ ���� ������ ������
		sb.reverse();
		System.out.println("�ݴ�� : " + sb.toString());
	}
	
	public void practice3() {
		StringBuffer sb = new StringBuffer(str);
		// ���ڿ� insert
		sb.insert(10, " �������� ?!?!?!?!");
		System.out.println("���ڿ� �߰� : " + sb.toString());
	}
	
	public void practice4() {
		StringBuffer sb = new StringBuffer(str);
		// ���ڿ� ��ü
		sb.replace(0, 2, "����");
		System.out.println("���ڿ� ��ü : " + sb.toString());
	}
	
	public void practice5() {
		StringBuffer sb = new StringBuffer(str);
		// ���ڿ� ����
		sb.delete(2, 6);
		System.out.println("���ڿ� ���� : " + sb.toString());
	}
}
