package com.kh.ThreadMain;

import java.io.IOException;
import java.util.Random;

public class SimpleGame {
	
	private static  boolean isGameOver = false;

	public static void main(String[] args) {
		// �ܺ� Ŭ������ �ν��Ͻ��� ����
		SimpleGame s = new SimpleGame();
		
		Thread gameThread= new Thread(s.new Gm());
		gameThread.start();
		
		// ���� ���� ���� : �÷��̾ Enter Ű�� ������ ���� ����
		try {
			// ����ڰ� Ű����� �Է��� ����Ʈ�� ����
			// ����ڰ� EnterŰ�� ���� �� ���� ���α׷� �Ͻ� ����
			System.in.read();
			
			isGameOver = true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	class Gm implements Runnable {
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
		
	}
}
