package com.kh.ListAndArray;

import java.util.ArrayList;
import java.util.List;

public class ListAndArray {
	public static void main(String[] args) {
		
		 ListArray1();
		
		 ListAndArray ListAndArray = new ListAndArray();
		 ListAndArray.ListArray2();
	}
	
	public static void ListArray1() {
		// Array ����
		int[] intArray = new int[2];

		intArray[0] = 1;
		intArray[1] = 2;

		System.out.println("Array ��� : ");
		for (int a = 0; a < intArray.length; a++) {
			System.out.println(intArray[a] + " ");
		}
		
		System.out.println("");
		
		// List ����
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		
		System.out.println(" List ��� : ");
		for (int num : intList) {
			System.out.println(num + " ");

		}
	}
	
	public void ListArray2() {
		// String���� ���� �� Array�� list �� ���
		
		String[] strArray = new String[2];
		strArray[0] = "�ȳ�ȳ�";
		strArray[1] = "�ȳ����";

	
		System.out.println("Array ��� : ");
		for (int a = 0; a < strArray.length; a++) {
			System.out.println(strArray[a] + " ");
		}
		System.out.println();
		
		List<String> strList = new ArrayList<>();
		strList.add("�ȳ�ȳ�");
		strList.add("�ȳ����");
		strList.add("�־ȳ����?");
		strList.add("�׳ɾȳ����");
		
		System.out.println(" List ��� : ");
		for(String str : strList) {
			System.out.println(str + " ");
		}
	}
}
