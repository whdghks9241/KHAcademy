package com.kh.practice;

import java.util.HashMap;
import java.util.Map;

public class UserExam {
	public static void main(String[] args) {
		// Map �̸� ����
		Map<String, Integer> userInfo = new HashMap<>();

		userInfo.put("����ȯ", 31);
		userInfo.put("��XX", 29);
		userInfo.put("��EE", 27);
		userInfo.put("��RR", 19);
		
		
		// �˻��� �̸�
		String userName = "��RR";
		if (userInfo.containsKey(userName)) {
			int userAge = userInfo.get(userName);
			
			System.out.println(userName + " : " + userAge);
			System.out.println("");
		} else {
			System.out.println(userName + " �� ���̸� ã���� �����ϴ�.");
		}
	}
}
