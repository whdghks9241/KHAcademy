package com.kh.instance.americano;

// �⺻ �Ƹ޸�ī��
public class Americano {

	// �Ƹ޸����� ������
	private int size;
	
	// ���� ����
	private boolean hasSugar;
	
	public Americano(int size, boolean hasSugar) {
		this.size = size;
		this.hasSugar = hasSugar;
	}
	
	public void makeCoffee() {
		System.out.println("�Ƹ޸�ī�븦 ����ϴ�.");
		System.out.println("ũ�� : " + size);
		
		// ���� ������ �ִ´ٸ�
		if (hasSugar) {
			System.out.println("������ �߰��մϴ�.");
		} else {
			System.out.println("������ �߰����� �ʽ��ϴ�.");
		}
	}

	
}
