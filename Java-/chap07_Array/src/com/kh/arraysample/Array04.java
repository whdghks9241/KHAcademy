package com.kh.arraysample;

public class Array04 {
	
	public static void main (String[] args) {
		
		// Array ����
		// 						       0	  1 	  2	    3     4
//		String[] ints
		/**
		 * ���� String[] fruitArray = {"���", "����", "Ű��", "�޷�", "��"};
		 * ������� �ٳ���
		 * ���⿡�� ����
		 * Ű������ ����
		 * �޷п��� ��
		 * �ֿ��� ������
		 */
		// �ʱ� array
		String[] fruitArray = {"���", "����", "Ű��", "�޷�", "��"};
		// �� �ε����� ����� ������
		fruitArray[0] = "�ٳ���";
		fruitArray[1] = "����";
		fruitArray[2] = "����";
		fruitArray[3] = "��";
		fruitArray[4] = "������";
		
		// �ε������� ����� ������ ���
		for (int i =0 ; i < fruitArray.length; i++) {
			System.out.println("fruitArray[" + i + "] : " + fruitArray[i] );
		}

	}
}
