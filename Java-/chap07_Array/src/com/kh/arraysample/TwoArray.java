package com.kh.arraysample;

public class TwoArray {

	public static void main(String[] args) {
		// ���� ���ڿ� �迭 ����� �ʱ�ȭ
		String[][] fruits = {
				{"Apple", "Banana", "cherry"} , 
				{"Grapes", "Orange", "strawberry"}, 
				{"Kiwi", "Mango", "PineApple"}
			}; 

		for (int i = 0; i < fruits.length; i++) {
			for (int j = 0; j < fruits[i].length; j++) {
				System.out.print(fruits[i][j] + " "); 
			}
			// ���������� �̵��� �� �ְ� enter�� ��� �޼ҵ� �Է�
			System.out.println(""); 
		}
	}
}
