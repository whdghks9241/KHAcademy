package com.kh.abstractSample.Animal;

public class Dog extends Animal{
	
	String name;

	// ������ super 
	public Dog(String name) {
		super(name);
	}

	// @Override ���
	public String makeSound() {
		return "�۸�";
	}
}
