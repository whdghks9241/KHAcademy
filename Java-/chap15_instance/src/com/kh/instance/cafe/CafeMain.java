package com.kh.instance.cafe;

public class CafeMain {

	public static void main(String[] args) {
		// ������� ��������
		Cafe Cafe1 = new Cafe("���̽�����", 3, false);

		Cafe Cafe2 = new Cafe("�Ƹ޸�ī��", 3, true);
		
		Cafe Cafe3 = new Cafe("�����ƾ��̽�Ƽ", 3, true);
		

		Cafe1.makeing();
		Cafe2.makeing();
		Cafe3.makeing();
	}
}
