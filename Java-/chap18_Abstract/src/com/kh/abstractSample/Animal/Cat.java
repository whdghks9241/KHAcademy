package com.kh.abstractSample.Animal;

public class Cat extends Animal{

	// ������ super 
	public Cat(String name) {
		super(name);
	}

	@Override
	public String makeSound() {
		return "�߿�";
	}
	
}
