package com.kh.practice.exam;

import java.util.Arrays;
import java.util.Scanner;

public class Practice21 {

	public static void main(String[] args) {
		/**
		 	����ڰ� �Է��� ���� �迭�� �ִ��� �˻��Ͽ�
			������ ��OOO ġŲ ��� ���ɡ�, ������ ��OOO ġŲ�� ���� �޴��Դϴ١��� ����ϼ���.
			��, ġŲ �޴��� ���ִ� �迭�� ���� ������ ���ϼ���.
			ex.
			ġŲ �̸��� �Է��ϼ��� : ��� ġŲ �̸��� �Է��ϼ��� : �Ҵ�
			���ġŲ ��� ���� �Ҵ�ġŲ�� ���� �޴��Դϴ�
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("ġŲ �̸��� �Է��ϼ���");
		String choiceMenu = sc.next();
		
		String[] menu = {"�Ķ��̵�","���","����","�Ĵ�","��Ͼ�"};
			String strMenu;
		
		boolean unHave = false;
		
		for (int i = 0; i < menu.length; i++)  {
			System.out.println(menu[i]);
			
			if (choiceMenu.equals(menu[i])) {
				unHave = true;
			}
		}
		System.out.println(unHave);
		
		if (unHave == true) {
			System.out.println(choiceMenu + "ġŲ ��ް���.");

		} else {
			System.out.println(choiceMenu + "ġŲ�� ���� �޴��Դϴ�.");
		}
		
	}

}
