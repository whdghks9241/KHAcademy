package com.kh.inheriance.animal;

public class Dog extends Animal{
	public Dog(String name) {
		// ���� Ŭ����(Animal)�� �ɹ��� �����ϴ� �� ���
		super(name);
		
		
//		public void makeSound() {
//			System.out.println(super.name + "�۸�!! ¢���ϴ�");
//		}
	}
	
	public void speak() {
		System.out.println(getName() + "�۸�");
	}

}
