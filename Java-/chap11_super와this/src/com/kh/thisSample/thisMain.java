package com.kh.thisSample;

/**
this �ν��Ͻ� �ڽ��� ����Ű�� ��������, �ν��Ͻ��� �ּҰ� ����
		/*
		// ���� x�� 10���� �Ҵ�
		int x = 10; 
		// �������� y x ����ŲŲ��
		int y = x;
		
		x = 20;
		
		System.out.println("y  : "+y);

		int[] list1 = {1,2,3};
		int[] list2 = list1;
		this ��ü (= �ν��Ͻ�) �ڽ��� �ڱ�Ű�� �������� ��ü(=�ν��Ͻ�)�� �ּҰ� ����
		this() ���� Ŭ������ �ٸ� �����ڸ� ȣ���ϴµ� ���
*/

class MyClass {
	int myField;
	
	// ù ��° ������
	MyClass() {
		this(0); // this() ����ؼ� �ٸ� ������ ȣ��
	}
	
	MyClass(int value) {
		this.myField = value;
	}
	
	void printValue() {
		System.out.println("myField�� �� : " + this.myField);
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
