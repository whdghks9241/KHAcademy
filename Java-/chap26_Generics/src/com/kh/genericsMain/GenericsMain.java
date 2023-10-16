package com.kh.genericsMain;

import java.util.ArrayList;

public class GenericsMain {

	public static void main(String[] args) {
		// ������ �����͸� �����ϴ� ArrayList
		ArrayList<Integer> intList = new ArrayList<>();

		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		ArrayList<String> strList = new ArrayList<>();
		strList.add("�����");
		strList.add("�谡");
		strList.add("���Ŀ�");

		printList(intList);
		printList(strList);
		
	}
	
	public static <t> void printList(ArrayList<t> list) {
		for (t item : list) {
			System.out.println(item);
		}
	}
}
