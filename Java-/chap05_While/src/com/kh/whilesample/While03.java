package com.kh.whilesample;

public class While03 {

	public static void main(String[] args) {
		// �ݺ������� ��� 
		int i = 1;
		while(i <= 10) {
//			System.out.println(i++);
			System.out.println(i);
			i = ++i;
			/**
			 * i++ �� �� i�� ���� ���� �����߱� ������ ++�� �۵����� ���� -> ���ѷ��� �߻�
			 * ++i �� ���� i��  +1�� ���� �����߱� ������ 1~10 ���� ��µ� -> ���ѷ��� �߻�����.
			 */
		}
	}
}
