package com.kh.CollectionMain;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class UserMamExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HaspMap ���� UserAge
		// ������ �̸��� ����
		Map<String, Integer> userInfo = new HashMap<>();
		userInfo.put("����ȯ", 31);
		userInfo.put("����ȯ", 88);
		userInfo.put("����ȯ", 35);
		userInfo.put("����ȯ", 39);
		
		// Ư�� ���� �˻�
		String userName = "����ȯ";
		if (userInfo.containsKey(userName)) {
			// ���� �����ؽ��ʿ��� �����̸��� Ű�� ������ �ִ� ������ �����´�
			int userAge = userInfo.get(userName);
			System.out.println(userName + " : " + userAge);
			System.out.println("");
		} else {
			System.out.println(userName + "�� ���̸� ã���� �����ϴ�.");
			System.out.println("");
		}
		
		// ��� ���� ���
		for (Entry<String, Integer> entry : userInfo.entrySet()) {
			userName = entry.getKey();
			int userAge = entry.getValue();
			System.out.println(userName + " : " + userAge);
		}
		
		// ������ ���� ���� 
		String updateUserName = "����ȯ";
		int update = 29;
		userInfo.put(updateUserName, update);
		System.out.println(updateUserName + " �� ������ " + update + " �� �����߽��ϴ�");
		System.out.println("");
		
		// ���� Ż��
		userInfo.remove(updateUserName);
		
		
		// ���� ���� ��� 
		// ��� ���� ���
		for (Entry<String, Integer> entry : userInfo.entrySet()) {
			userName = entry.getKey();
			int userAge = entry.getValue();
			System.out.println(userName + " : " + userAge);
		}
	}

}
