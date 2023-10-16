package com.kh.thread.random.NumberGamr;

public class GuessingThread extends Thread {
    private int targetNumber;
    private int guess;
    private boolean finished;

    public GuessingThread(int targetNumber) {
        this.targetNumber = targetNumber;
        this.finished = false;
    }

    @Override
    public void run() {
        while (!finished) {
            if (guess != 0) {
                if (guess < targetNumber) {
                    System.out.println("�� ū ���ڸ� �Է��ϼ���.");
                } else if (guess > targetNumber) {
                    System.out.println("�� ���� ���ڸ� �Է��ϼ���.");
                } else {
                    System.out.println("�����Դϴ�!");
                    finished = true;
                }
                guess = 0; // ���� ������ ���
            }
        }
    }

    public synchronized void guess(int number) {
        this.guess = number;
    }

    public boolean isFinished() {
        return finished;
    }
}
