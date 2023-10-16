package com.kh.abstractSample.Animal;

abstract class Animal {

	// �ʵ� s name;
	private String name;
	// ������
	
	public Animal (String name) {
		this.name = name;
	}
	
	public String displayName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// �Ϲ� �޼��� �����̸� ��� void displayName();
//	public void displayName() {
//		System.out.println("Animal name : " + name);
//
//	}
	
	// �߻�޼��� �����Ҹ���� void makeSound();
	
	abstract String makeSound();

}
