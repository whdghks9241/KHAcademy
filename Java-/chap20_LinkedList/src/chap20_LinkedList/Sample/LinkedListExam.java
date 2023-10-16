package chap20_LinkedList.Sample;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {

	public static void main(String[] args) {
		// List �������̽� LinkedList ��ü Ȱ���� ���� �ְ� ���
		List<String> linkedList = new LinkedList<>();
		// String �� �ְ� ���� ���� ���
		linkedList.add("ù ��°");
		linkedList.add("�� ��°");
		linkedList.add("�� ��°");
 
		System.out.println("linkedList : " + linkedList);

		linkedList.set(1, "2��°");
		System.out.println("linkedList : " + linkedList);
		
		linkedList.remove(1);

		System.out.println("linkedList : " + linkedList);
		// LinkedList ��ü new LinkedList ��ü
		// int �� �ְ� ���� ���� ���
		List<Integer> linkedList2 = new LinkedList<>();
		// String �� �ְ� ���� ���� ���
		linkedList2.add(1);
		linkedList2.add(2);
		linkedList2.add(3);
		
		System.out.println("linkedList : " + linkedList2);

		linkedList2.set(1, 7);
		System.out.println("linkedList : " + linkedList2);
		
		linkedList2.remove(1);

		System.out.println("linkedList : " + linkedList2);
		
 
	}
}
