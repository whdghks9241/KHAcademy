package com.kh.thisSample;

/**
this 인스턴스 자신을 가리키는 참조변수, 인스턴스의 주소가 저장
		/*
		// 정수 x를 10으로 할당
		int x = 10; 
		// 참조변수 y x 가리킨킨다
		int y = x;
		
		x = 20;
		
		System.out.println("y  : "+y);

		int[] list1 = {1,2,3};
		int[] list2 = list1;
		this 객체 (= 인스턴스) 자신을 자기키는 참조변수 객체(=인스턴스)의 주소가 저장
		this() 현재 클래스의 다른 생성자를 호출하는데 사용
*/

class MyClass {
	int myField;
	
	// 첫 번째 생성자
	MyClass() {
		this(0); // this() 사용해서 다른 생성자 호출
	}
	
	MyClass(int value) {
		this.myField = value;
	}
	
	void printValue() {
		System.out.println("myField의 값 : " + this.myField);
	}
}
public class thisMain {

	public static void main(String[] args) {
		MyClass obj1 = new MyClass();
		MyClass obj2 = new MyClass(10);
		
		obj1.printValue();
		obj2.printValue();

	}

}
