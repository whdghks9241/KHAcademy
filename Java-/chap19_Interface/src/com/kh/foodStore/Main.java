package com.kh.foodStore;

public class Main {

	public static void main(String[] args) {
		Order order = new Order();
		order.addMenu("«��");
		order.addMenu("¥���");
		order.addMenu("��«��");
	
		order.printMenu();
		
		FoodStore order1 = new Order2();
		order1.addMenu("�Ұ�� �ֹ�");
		order1.addMenu("���� �ֹ�");
		order1.addMenu("���屹 �ֹ�");
	
		order1.printMenu();
	}
}
