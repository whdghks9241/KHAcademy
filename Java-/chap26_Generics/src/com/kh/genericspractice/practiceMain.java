package com.kh.genericspractice;

import java.util.ArrayList;
import java.util.List;

public class practiceMain {

	public static void main(String[] args) {
		// String Integer t ����ؼ� ���
		practiceMain pm = new practiceMain();
//		pm.practice1();
		pm.practice2();
	}
	
	public void practice1() {

		ArrayList<Integer> intList = new ArrayList<>();

		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		
		ArrayList<String> strList = new ArrayList<>();
		strList.add("�������");
		strList.add("��������������");
		strList.add("����������������");
		strList.add("������ȣȣȣȣȣȣ");
		
		printList(intList);
		printList(strList);
	}
	
	public static <t> void printList(ArrayList<t> list) {
		for (t item : list) {
			System.out.println(item);
		}
	}
	
	public void practice2() {
		
		ArrayList<Object> list = new ArrayList<>();
		
		// Box ��ü�� ����
		// ���ڿ� �����͸� �����ϴ� BOX �ν��Ͻ� ����
		// �� �� ���
		items<String> stritem  = new items<>();
		stritem.put("������ 1��", list);
		stritem.put("������ 2��", list);
		stritem.put("������ 3��", list);
		
		String strValue = stritem.get();
		System.out.println("String Value  :  " + strValue);

		// �߼��� �����͸� �����ϴ� BOX �ν��Ͻ� ����
		items<Integer> intitem = new items<>();
		intitem.put(1, list);
		intitem.put(3, list);
		intitem.put(5, list);
		intitem.put(7, list);
		intitem.put(19, list);
		
		int intValue = intitem.get();
		System.out.println("Int Value  :  " + intValue);

		// ���� for�� �̿��ؼ� �� ��� ���
		// �� �� ���
	
		for (int i = 0; i < list.size(); i++) {
			System.out.println("str  :  " + list.get(i));

		}
		
		for (Object asd : list) {
			System.out.println(asd);
		}
	}
	
	
}
