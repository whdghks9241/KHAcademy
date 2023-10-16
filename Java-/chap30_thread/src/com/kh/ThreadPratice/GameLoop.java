package com.kh.ThreadPratice;

import java.util.Random;

public class GameLoop implements Runnable {
	
	private static boolean isGameOver = false;
	
	@Override
	public void run() {
		while(!isGameOver) {
			//���� ���� ����
			int randomValue = new Random().nextInt(12);
			System.out.println("������ ���� : " + randomValue);
		
			// ���� ���� �����ð�
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// ���� ���� ����
			// Enter Ű�� ������ ������ ����ȴ�.
			System.out.println("������ �����Ϸ��� Enter�� ��������");
		}
		System.out.println("���� ����");
	}

	public boolean isGameOver() {
		return isGameOver;
	}

	public void setGameOver(boolean isGameOver) {
		GameLoop.isGameOver = isGameOver;
	}
	

	
}
