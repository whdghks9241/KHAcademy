package com.kh.inheriance.animal;

public class Cat extends Animal{

	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void run() {
		System.out.println(getName() + "������ �ͼ� �޸���");
	}
	
	@Override // �ѹ��� �ٽ� ���Ǹ� ������ / �������� ���� �ϱ����� ����ϱ⵵��
	public void eat() {
		System.out.println(getName() + " �Դµ� �߰��� ������ �����ž�");
	}
}
