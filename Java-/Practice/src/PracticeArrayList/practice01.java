package PracticeArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class practice01 {
/**
 	3-1)
 		���ֳ����ĳ���
 		
 		���� 3ȸ 1.3.5 -> �� , ���� , �׸� ����
		���ϱ� 2ȸ -> ��Ȳ �ڿ�  [���ο�], �Ķ� �ڿ�[�����Ķ�]
		���� for �� �̿��ؼ� ���� ����ϱ�
		���� ��� -> �� �� ��
 */
	public static void main(String[] args) {
	
		ArrayList<String> colorList = new ArrayList<String>(Arrays.asList("������", "��Ȳ��", "�����", "�ʷϻ�", "�Ķ���", "����", "�����"));
		
		System.out.println("colorList : " + colorList);

		colorList.set(1, "��");
		colorList.set(3, "����");
		colorList.set(5, "�׸�");
		System.out.println("colorList : " + colorList);

		colorList.add(2, "���ο�");
		colorList.add(6, "�����Ķ�");
		System.out.println("colorList : " + colorList);
		
		for (String str : colorList) {
			if (str == "������" || str == "�Ķ���" || str == "�����" ) {
				System.out.println("���� ��� : " + str);
			}
		}
	}
}
