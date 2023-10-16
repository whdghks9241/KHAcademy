package com.kh.student;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExam {
	public static void main(String[] args) {
		
		// HashMap ����
		Map<String, Integer> studentGrades = new HashMap<>();
		
		// �л��� ������ �߰��ϰڽ��ϴ�.
		studentGrades.put("KH", 95);
		studentGrades.put("GH", 95);
		studentGrades.put("EHa", 65);
		studentGrades.put("Oia", 78);
		
		// Ư�� �л��� ���� �˻�
		// containsKey : �ʿ��� key(Ű), value(��)�� �ִ��� Ȯ
		String studentName = "Oia";
		// ���� �л��� �߿��� Oia�� �ִٸ�
		if (studentGrades.containsKey(studentName)) {
			int grade = studentGrades.get(studentName);
			System.out.println(studentName + " : " + grade);
			System.out.println("");
		} else {
			System.out.println(studentName + "�� ������ ã�� �� �����ϴ�.");
			System.out.println("");
		}
		
		// ��� �л��� ���� ���
		for (Entry<String, Integer> entry : studentGrades.entrySet()) {
			String name = entry.getKey();
			int grade = entry.getValue();
			System.out.println(name + " : " + grade);
		}
		
		// �л� ���� ����
		String GradeUpdate = "Oia";
		int newGrede = 99;
		studentGrades.put(GradeUpdate, newGrede);
		System.out.println(GradeUpdate + " �� ������ " + newGrede + " �� �����߽��ϴ�");
		System.out.println("");
		
		// �л� ����
		String removeStudent = "KH";
		studentGrades.remove(removeStudent);
		
		System.out.println(removeStudent + "�� ������ ���� �߽��ϴ�.");
		System.out.println("");
		
		
		// ���� �л� ���� ���
		System.out.println("�����л� ���� : ");
		for (Entry<String, Integer> entry : studentGrades.entrySet()) {
			String name = entry.getKey();
			int grade = entry.getValue();
			System.out.println(name + " : " + grade);
		}
	}
}
