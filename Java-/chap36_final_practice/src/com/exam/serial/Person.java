package com.exam.serial;

import java.io.Serializable;

/**
	Serializable
	 �������̽�
	 Ŭ������ ��ü�� ����ȭ �Ǵ� ������ȭ�� ����
	 ����ȭ : ��ü�� ����Ʈ ��ũ������ ��ȯ�ϴ� ���μ���
	 ������ȭ : ����Ʈ ��ũ������ ��ü�� ��ȯ�ϴ� ���μ���
	 ��ü�� ���Ͽ� �����ϰų� ��Ʈ��ũ�� ���� �����ϴ� ���� �۾��� ������ �� ����
	 ��ü�� ���¸� �����ϰ� �����ϱ� ���� ����
 */
public class Person implements Serializable {

	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + age;
	}
}
