package com.kh.arrayListSample;

import java.util.ArrayList;

public class toDoSample {
	/**
	 * 	toDoSample.java
	 * ArrayList �̿��ؼ� ���� 
	 * �����  (3��)
	 * �����ϰ�  (2��)
	 * ����� (1��)
	 * ���δ� ���� �ϱ�
	 */
	public static void main(String[] args) {
		
		ArrayList<String> workingList = new ArrayList<String>();

		workingList.add("�Ͼ��");
		workingList.add("�ڵ��ϱ�");
		workingList.add("��Ա�");
		
		System.out.println("���� �߰� : " + workingList);

		workingList.set(1, "�����ϱ�");
		workingList.set(2, "��å�ϱ�");
		
		System.out.println("���� ���� : " + workingList);
		
		workingList.remove(2);
		
		System.out.println("���� ���� : " + workingList);
		
		
		for (String work : workingList) {
			System.out.println("���� ��� : " + work);
		}
		

		workingList.clear();
		
		System.out.println("���� �ʱ�ȭ : " + workingList);
	}
}
