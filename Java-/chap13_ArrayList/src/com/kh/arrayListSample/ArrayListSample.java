package com.kh.arrayListSample;

import java.util.ArrayList;
/**
 * 	toDoSample.java
 * ArrayList �̿��ؼ� ���� 
 * �����  (3��)
 * �����ϰ�  (2��)
 * ����� (1��)
 * ���δ� ���� �ϱ�
 */
public class ArrayListSample {

	public static void main(String[] agrs) {
		
		// �� ArrayList ����
		ArrayList<String> fruits = new ArrayList<String>();
		
		System.out.println("fruits : " + fruits);
		
		// ��� �߰�
		fruits.add("���");
		System.out.println("��� �߰� : " + fruits);
		
		fruits.add("�ٳ���");
		fruits.add("Ű��");
		fruits.add("������");
		fruits.add("���");
		fruits.add("��");
		fruits.add("����");

		System.out.println("fruits : " + fruits);
		
		String firstFruits = fruits.get(0);
		System.out.println("ù��° ���� : " + firstFruits);	
		
		fruits.set(2,"����");
		System.out.println("fruits : " + fruits);
		
		System.out.println(fruits.remove(5));	

		System.out.println("���� ���� : " + fruits);	
		System.out.println("");	
		System.out.println("===========================================");
		System.out.println("");	
		
		// ��� 1
		for (String fruit : fruits) {
			System.out.println("���� ��� " + fruit);
		}
		
		// ��� 2
		for (int i = 0; i < fruits.size(); i ++) {
			System.out.println("���� ��� " + i + " : " + fruits.get(i));
		}
		

	}
}
