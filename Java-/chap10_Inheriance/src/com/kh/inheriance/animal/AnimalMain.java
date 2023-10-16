package com.kh.inheriance.animal;

public class AnimalMain {
	public static void main(String[] args) {
		
		Dog myDog = new Dog("�����");
		System.out.println("======================================");

		myDog.info();
		myDog.speak();
		myDog.eat();
		System.out.println("");
		System.out.println("======================================");
	
		Cat myCat = new Cat("�����");
		myCat.run();		
		myCat.eat();
		System.out.println("");
		System.out.println("======================================");

		Lion myLion = new Lion("����");
		myLion.action();
		myLion.eat();
		System.out.println("");
		System.out.println("======================================");

		Monkey myMonkey = new Monkey("����");
		myMonkey.action();
		myMonkey.eat();
		System.out.println("");
	}
}
