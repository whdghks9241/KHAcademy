package com.kh.CollectionMain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionMain {

	public static void main(String[] args) {
		// List 
		List<String> myList = new ArrayList<>();
		myList.add("���");
		myList.add("�ٳ���");
		myList.add("����");
		
		System.out.println("List : ");
		// ���� for�� Ȱ���ؼ� ���
		for(String fruit : myList) {
			System.out.println(fruit);
		}
		
		Set<Integer> myset = new HashSet<>();
		myset.add(1);
		myset.add(2);
		myset.add(3);
		myset.add(2); // �ߺ��� ��Ҵ� ������� ����
		
		for (Integer number : myset) {
			System.out.println(number);
		}
		
		// Map ����
		Map<String, Integer> myMap = new HashMap<>();
		myMap.put("�ѱ�", 1);
		myMap.put("�̱�", 2);
		myMap.put("�߱�", 3);
		myMap.put("�Ϻ�", 4);
		myMap.put("��Ʈ��", 5);
		myMap.put("�±�", 6);
		myMap.put("���þ�", 7);
		myMap.put("������", 8);
		myMap.put("����", 9);
		myMap.put("��Ż����", 10);
		
		for (String country:myMap.keySet()) {
			int code = myMap.get(country);
			
			System.out.println(country + " : " + code);
		}
	}
}
