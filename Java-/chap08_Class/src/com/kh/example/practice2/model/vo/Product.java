package com.kh.example.practice2.model.vo;

/**
 * 	pName : String
 *  price : int
 *  brand : String
 *  Product()
 *  information() : void
 */
public class Product {
	// 1. �ɹ�����
	// pName : String
	// price : int
	// brand : String

	 
	String pName, brand;
	
	int price;
	
	// 2. ������ this�� Ȱ���ؼ� ��������
	// Product()
	public Product(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}

	// 3.. ���� ��� �޼ҵ� �����
	// information() : void
	public void information() {
		System.out.println("��ǰ�� : " + pName);
		System.out.println("���� : " + price + "��");
		System.out.println("�귣�� : "+ brand);
	}
		
}
