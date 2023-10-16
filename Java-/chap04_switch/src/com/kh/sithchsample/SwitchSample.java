package com.kh.sithchsample;

public class SwitchSample {
	public static void main(String[] args) {
		// Switch��
		/**
		 * Ư�� ������ ǥ������ ���� ���� �پ��� ��츦 ó���ϴ� ���� ����
		 * switch ���� �Ϸ��� case ���� �ش� ���� ���Ͽ� ��ġ�ϴ� ��쿡 �ش��ϴ� �ڵ� ����� ����
		 * �� case�� �ڿ��� ��ġ�ϴ� ���̳� ǥ������ ����
		 * 
		 * switch (���� �Ǵ� ǥ����) {
		 * 	case ��1 :
		 * 		// ��1�� �ش��ϴ� �ڵ�
		 * 		break; // �ش� ����� ������ �ߴ��ϴ� ����
		 *  case ��2 : 
		 *  	// ��2�� �ش��ϴ� �ڵ�
		 *  	break;
		 *  default :
		 *  	// �� ��� ���̽��� ��ġ���� ���� �� ����Ǵ� �ڵ�
		 *  }
		 */
		
		int day = 30;
		switch (day) { // day == 30
			// case�� 30�̸� ������ ���
			case 1: 
				System.out.println("������"); // ��µ��� ����
				break;
			case 2:
				System.out.println("ȭ����"); // ��µ��� ����
				break;
			case 30:
				System.out.println("������");
				break;
			default :
				System.out.println("�ָ�");
				break;
		}
		
		// Ŀ���ֹ� ����
		/**
		 * 1���� �����ϸ� �Ƹ޸�ī��
		 * 2���� �����ϸ� ī���
		 * 3���� �����ϸ� ���ν����
		 * 4���� �����ϸ� ������Ƽ
		 */
		int choice = 1;
		switch(choice) {
			// 1�� ���ý� �Ƹ޸�ī��
			case 1:
				System.out.println("�Ƹ޸�ī�� �ֹ��ϼ̽��ϴ�.");
				break;
			// 2�� ���ý� ī���
			case 2:
				System.out.println("ī��� �ֹ��ϼ̽��ϴ�.");
				break;
			// 3�� ���ý� ���ν����
			case 3:
				System.out.println("���ν���� �ֹ��ϼ̽��ϴ�.");
				break;
			// 4�� ���ý� ������Ƽ
			case 4:				
				System.out.println("������Ƽ �ֹ��ϼ̽��ϴ�.");
				break;
			default :
				System.out.println("�߸��� �ֹ��Դϴ�. �ٽ� �ֹ����ּ���.");
				break;
		}
	}
}
