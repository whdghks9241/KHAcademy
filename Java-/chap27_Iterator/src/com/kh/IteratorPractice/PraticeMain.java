package com.kh.IteratorPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class PraticeMain {

	public static void main(String[] args) {
		//AarayLsit ���� �� ��� �߰�
		ArrayList<String> fruit = new ArrayList<>();
		fruit.add("���");
		fruit.add("�ٳ���");
		fruit.add("����");
		//Iterator ����
		Iterator<String> iter = fruit.iterator();
		
		//Iterator�� ����Ͽ� ��� �ݺ�
		while (iter.hasNext()) {
			String f = iter.next();
			System.out.println(f);
		}
		
		//��� ����
		
		//ArrayList ����ϱ�

	}

}