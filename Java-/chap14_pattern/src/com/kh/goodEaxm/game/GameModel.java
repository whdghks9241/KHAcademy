package com.kh.goodEaxm.game;

// ���� ���� ���߱� ���� ��
public class GameModel {
	
	// ������ ��ȣ
	private int secretNumber;
	// �� �� �õ��ߴ°�
	private int attempts;

	
	public GameModel() {
		// 1 ~ 100 ������ ������ ���� �����ϱ�
		secretNumber = (int) (Math.random() * 10) + 1;
		attempts = 0;
	}
	
	// 1 ���� 100���� �� ��ǻ�Ͱ� 
	public int getSecretNumber() {
		return secretNumber;
	}
	
	public int getAempts() {
		return attempts;
	}
	
	public void incrementApttempts() {
		attempts++;
	}
	
	public boolean inCorrectFuess(int guess) {
		incrementApttempts();
		// Guess�� ���� �Է��߱� ������ ���� �޼ҵ带 �߰�
		return guess == secretNumber;
	}
}
