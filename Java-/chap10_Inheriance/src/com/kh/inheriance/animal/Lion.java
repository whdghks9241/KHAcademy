package com.kh.inheriance.animal;

public class Lion extends Animal {

	public Lion(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void action() {
		System.out.println(getName() + " ����� �Ҷ� ���� �������ϴ�");
	}
	
	@Override
	public void eat() {
		System.out.println(getName() + " �� ���̸� ������ ������ �þ�Խ��ϴ�.");
	}
	
}
