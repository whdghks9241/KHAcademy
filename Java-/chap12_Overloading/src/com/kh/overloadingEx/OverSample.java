package com.kh.overloadingEx;

public class OverSample {
	/**
	 java ���� �����
	 OverSample.java �����
	 �����ε� 5�� ����� �޼��� 5�� ���
	 */
	// 1. �Ű� ������ ���� ������
	
	String name;
	int age;
	
	public OverSample() {
		this.name = name;
		this.age = 0;
	}
	
	// 2. �̸��� �ʱ�ȭ �ϴ� ������
	public OverSample(String newName) {
		this.name = newName;
	}
	
	// 3. �̸��� ���̸� �ʱ�ȭ �ϴ� ������
	public OverSample(String newName, int newAge) {
		this.name = newName;
		this.age = newAge;
	}
	// 4. �̸��� ���� �������� ���̴� �ʱ�ȭ �ϴ� ������
	public OverSample(int newAge) {
		this.name = "No Name";
		this.age = newAge;
	}
	
	public int mul(int a, int b) {
		return a*b;
	}
	public int mul(int a, int b, int c) {
		return a*b*c;
	}
	public int mul(int a, int b, int c, int d) {
		return a*b*c*d;
	}
	public double mul(double a, double b) {
		return a*b;
	}
	public double mul(double  a, double  b, double  c) {
		return a*b*c;
	}
	
	public static void main(String[] args) {
		OverSample obj = new OverSample();

		OverSample obj1 = new OverSample();
		OverSample obj2 = new OverSample("����");
		OverSample obj3 = new OverSample("����", 20);
		OverSample obj4 = new OverSample(20);

		// �޼��� ȣ��
		System.out.println("�� ������ �� : " + obj.mul(50, 50));
		System.out.println("�� ������ �� : " + obj.mul(50, 50, 20));
		System.out.println("�� ������ �� : " + obj.mul(50, 50, 20, 5));
		System.out.println("�� �Ǽ��� �� : " + obj.mul(51.0, 50.90));
		System.out.println("�� �Ǽ��� �� : " + obj.mul(50.1, 50.5, 10.1));
	}
}
