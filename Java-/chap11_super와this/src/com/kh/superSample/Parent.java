package com.kh.superSample;

// ��ӹ޾Ƽ� super() super ������ Ȯ��
/**
 super : �θ� Ŭ������ ������ �޼��忡 �����ϱ� ���� ���
 
 super() : �θ� Ŭ������ �����ڸ� ȣ���ϱ� ���� ���
 			���� Ŭ������ �����ڿ��� ù ��° �ٿ� ȣ�� �Ǿ�� ��.
 */
public class Parent {
	
	String name;
	int age;
	
	Parent() {
		System.out.println("�θ� Ŭ������ �⺻ �������Դϴ�.");
	}
	
	Parent(String name) {
		// this ��� �̸��� ��뿡�� �ν��ϼ� ������ ���� ����+
		
		this.name = name;
		System.out.println("�θ� Ŭ������ ���ڿ� �Ķ���� ������ �Դϴ�! �̸� : " + name);
		System.out.println(" �̸� " + name);
	}
	
	public void show() {
		System.out.println("�θ� Ŭ������ show �żҵ� �Դϴ�.");
	}
}
