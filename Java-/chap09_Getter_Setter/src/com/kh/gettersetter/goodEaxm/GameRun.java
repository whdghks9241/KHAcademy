package com.kh.gettersetter.goodEaxm;

public class GameRun {

	public static void main(String[] args) {

		// �÷��� ������ �����
		GoodPlayer player1 = new GoodPlayer();

		player1.setName("Marin");
		
		player1.setHealth(-10);
		player1.ValidHealth();
		// -10 �� ���Ἲ(���������ڵ尡 ������ ������ ���� ������

		player1.setAttackpower(20);
		player1.ValidattackPower();;
		player1.displayInfo();
		
		// �÷��� ������ �����
		GoodPlayer player2= new GoodPlayer();

		player2.setName("Marin");
		
		player2.setHealth(-10);

		player2.setName("aomrom2");

		// -10 �� ���Ἲ(���������ڵ尡 ������ ������ ���� ������
		player2.setAttackpower(20);
		player2.ValidattackPower();;
		player2.displayInfo();
		
	}

}
