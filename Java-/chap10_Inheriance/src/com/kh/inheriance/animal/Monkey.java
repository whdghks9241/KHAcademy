package com.kh.inheriance.animal;

public class Monkey extends Animal{

	public Monkey(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void action() {
		System.out.println(getName() + " ������ ž�ϴ�");
	}
	
	@Override
	public void eat() {
		System.out.println(getName() + " �� ���̸� ������ �������� �ö󰩴ϴ�");
	}
}
