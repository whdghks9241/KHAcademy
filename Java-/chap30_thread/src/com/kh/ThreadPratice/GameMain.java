package com.kh.ThreadPratice;

import java.io.IOException;
public class GameMain {
	
	public static void main(String[] args) {
		// �ܺ� Ŭ������ �ν��Ͻ��� ����
		GameLoop gameLoop = new GameLoop();
		
		Thread gameThread= new Thread(gameLoop);
		gameThread.start();
		
		// ���� ���� ���� : �÷��̾ Enter Ű�� ������ ���� ����
		try {
			// ����ڰ� Ű����� �Է��� ����Ʈ�� ����
			// ����ڰ� EnterŰ�� ���� �� ���� ���α׷� �Ͻ� ����
			System.in.read();
			
//			isGameOver = true;
			gameLoop.setGameOver(true);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	
}
