package com.kh.thread.random.NumberGamr;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGameGMain {
    public static void main(String[] args) {
        // ���� ���� ����
        Random random = new Random();
        int targetNumber = random.nextInt(10) + 1; // 1���� 100 ������ ���� ����

        // ���� ������ ����
        GuessingThread guessingThread = new GuessingThread(targetNumber);
        guessingThread.start();

        // Ÿ�̸� ������ ���� (10�� ����)
        TimerThread timerThread = new TimerThread(10);
        timerThread.start();
        
        // ����� �Է� �ޱ�
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("���ڸ� �Է��ϼ���: ");
            int guess = scanner.nextInt();
            if (guessingThread.isFinished()) {
                System.out.println("������ ����Ǿ����ϴ�.");
                break;
            }
            guessingThread.guess(guess);
        }
    }
}