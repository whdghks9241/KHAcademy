package com.kh.collection.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PracticeCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeCollection pc = new PracticeCollection();

		pc.practiceList();
		pc.practiceSet();
		pc.practiceMap();
	}
	
	public void practiceList() {
		List<String> pList = new ArrayList<>(); 
		// String add �غ��� ���� ���
		pList.add("�谡");
		pList.add("����");
		pList.add("������");
		pList.add("������");
		
		for (String str : pList) {
			System.out.println(str);
		}
		
	}
	
	public void practiceSet() {
		Set<String> pSet = new HashSet<>();
		// String add �غ��� ���� ��� �ߺ��� �� add �ؾ���
		pSet.add("");
		pSet.add("�谡");
		pSet.add("����");
		pSet.add("������");
		pSet.add("�����");
		pSet.add("�����");
		pSet.add("�����");
		
		for (String str : pSet) {
			System.out.println(str);
		}
	}

	public void practiceMap() {
		// Ű�� ���� �̿��ؼ� map put �Ѵ��� ���� �������� ����غ���
		
		// �� ��üȭ ����
		Map<String , String> myMap = new HashMap<>();
		
		myMap.put("����ȯ", "����");
		myMap.put("����ȯ1", "����");
		myMap.put("����ȯ3", "�̼�");
		
		for (String name:myMap.keySet()) {
			String code = myMap.get(name);
			
			System.out.println(name + " , " + code);
		}
	}
}