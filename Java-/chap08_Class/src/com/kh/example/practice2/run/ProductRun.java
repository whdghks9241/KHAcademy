package com.kh.example.practice2.run;

import com.kh.example.practice2.model.vo.Product;

public class ProductRun {
	// Product ���� 3�� �ϰ�
	// ���� ��ǰ�� ���� �귣�� ����ϱ�
	public static void main(String[] agrs) {

		Product product = new Product("�ȭ", 3000, "����Ű");
		Product product1 = new Product("���", 300, "���");
		Product product2 = new Product("�޴���ȭ", 30000, "�Ｚ");
		
		product.information();		
		product1.information();		
		product2.information();
		
	}
}
