package chap20_LinkedList.Sample;

import java.util.LinkedList;
import java.util.List;

public class ListAndArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����
		List<String> linkedList = new LinkedList<>();

		linkedList.add("ù ��°");
		linkedList.add("�� ��°");
		linkedList.add("�� ��°");
 
		System.out.println("linkedList : " + linkedList);
		
		linkedList.remove(1);

		System.out.println("linkedList : " + linkedList);
		
		boolean isTrue = linkedList.contains("�� ��°");
		System.out.println("�� ��° ��� ���Կ��� : " + isTrue);
		
		int size = linkedList.size();
		System.out.println("ũ�� : " +size);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
}
