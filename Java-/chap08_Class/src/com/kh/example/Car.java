package com.kh.example;

public class Car {
	// 1. ���� �ʵ� �ɹ�����
	String brand;		//�귣��
	String model;		// ��
	int speed;			// ��
	boolean engineOn;	// ���� ����

	
	// 2. �����ڴ� �޼����� ���ڱ� ����
	// ���� �� �� �ʼ��� ���� �Ķ���ʹ� �귣��, ��)
	public Car(String model, String brand) {
		this.model = model;
		this.brand = brand;
		this.speed = 50;
		this.engineOn = true;
	}
	
	// ���� ���� �޼���
	public void startEngine() {
		
		System.out.println("�� ���� " + brand + "�Դϴ�");
		// ���࿡ ������ true ���� �õ�
		if (engineOn) {
			
			System.out.println("������ �õ��մϴ�.");
		} else {
			// ������ false �̹� ������ �����ִ�.
			System.out.println("�̹� ������ ���� �ֽ��ϴ�.");
		}
	}
	
	// ���� �޼���
	public void acclerate(int amount) {
		
		speed += amount;
		// ������ true�� ���� �ӵ��� �󸶴�.
		if (engineOn) {
			System.out.println("�ӵ�" + speed +" ���Դϴ�");
		// ������ false�� ������ ���� �־� �ӵ��� �� �� ����.	
		} else {
			System.out.println("�ӵ��� �� �� ����");
		}
	}
}
