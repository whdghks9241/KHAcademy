package com.kh.goodEaxm.game;

public class GameView {

	private String Stringstr = "���� ���߱� ������ �����մϴ�";
	private String Stringstr1 = "1���� 100 ������ ���ڸ� ���纸����!";
	private String Stringstr2 = "������ ���ڸ� �Է��ϼ���.";
	private String Stringstr3 = "Ʋ�Ƚ��ϴ� �ٽ� �õ��ϼ���.";

	public void displayMessage() {

		System.out.println(Stringstr);
		System.out.println(Stringstr1);
	}
	
	// ���ڸ� �����ϴ� �� �Է��ϰ� ������� Ʋ�ȴ��� ���°Ŷ� �õ� Ƚ�� �������� 
	public void displayGuessPromt() {
		System.out.println();
	}
	
	public void displayCorrectGuess() {
		System.out.println(Stringstr2);
	}
	
	public void displayinCorrectGuess() {
		System.out.println(Stringstr3);
	}
	
	public void displayAttempts(int attempts) {
		System.out.println("�õ�Ƚ�� : " + attempts);
	}
	
	public void displayGameOver() {
		System.out.println("��������!");
	}
}
