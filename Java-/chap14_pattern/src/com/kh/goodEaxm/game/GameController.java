package com.kh.goodEaxm.game;

import java.util.Scanner;

public class GameController {
	
	private GameModel model;
	private GameView view;

	public GameController(GameModel model, GameView view) {
		this.model = model;
		this.view = view;
	}

	public void runGame() {
		// ���� �޽��� ���
		view.displayMessage();
		// ��ĳ�� ���
		Scanner sc = new Scanner(System.in);

		while (true) {		
			// ���� �����ϴ� �� �Է�
			view.displayGuessPromt();
			int guess = sc.nextInt();
			
			if (model.inCorrectFuess(guess)) {
				// ��ǻ�Ͱ� ������ ���ڸ� ������ �� �ҷ��� view
				view.displayCorrectGuess();
				view.displayAttempts(model.getAempts());
				break;
			} else {
				// ��ǻ�Ͱ� ������ ���ڿ� ���� �Է��� ���ڰ� Ʋ���� �� view;
				view.displayinCorrectGuess();
				view.displayAttempts(model.getAempts());
			}
		}

		view.displayGameOver();

	}
	
	public static void main(String[] args) {
		
		GameModel m = new GameModel();
		GameView v = new GameView();
		GameController c = new GameController(m,v);
		
		c.runGame();
	}

}
