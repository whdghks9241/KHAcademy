package com.kh.abstractSample.Animal;

public class Main {
	public static void main(String[] args) {
		
		Animal[] animal = new Animal[2];
		
		Dog dog = new Dog("������");
//		System.out.print(dog.getname() + " ");

//		System.out.println(dog.makeSound());
	
		// 1. cat �����
		// Cat ct = new Cat ("�����")
		// 2. ��ü�迭�� Animal �����ؼ� ����ϱ� ���⼺�� Ȱ���� ��ü �ٷ��
		// Animal[] animal = new Animal[];
		Cat cat = new Cat("�����");

		animal[0] = dog;
		animal[1] = cat;
		
		for (Animal str : animal) {
			System.out.println(str.makeSound());
		}
		
	}
}
