package com.kh.superSample;

//            �ڽ�  ��ӹ޴´� 	 �θ�
public class Child extends Parent {
	// Child() -> ���������ڰ� default�� ����� ���� �� public�� �����ϴ�
	public Child() { 
		// �θ� Ŭ������ �⺻ ������ ȣ��
		super(); // 
		System.out.println("�ڽ� Ŭ���� �⺻ �������Դϴ�.");
	}
	
	public Child(String name) {
		// �θ� Ŭ������ ���ڿ� �Ķ���� ������ ȣ��
		super(name);
		System.out.println("�ڽ� Ŭ������ ���ڿ� �Ķ���� �������Դϴ�.");
	}
	
	public void display() {
		// �θ� Ŭ������ show ��� �޼��� ȣ��
		super.show();
		System.out.println("�ڽ� Ŭ������ display �޼��� �Դϴ�.");
	}
	
}
