package PracticeArrayList;

import java.util.Scanner;

public class practice07 {

	public static void main(String[] args) {
		// ����ڿ��� ���� ũ�� �Է¹ް�
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ũ�� : ");
		int numRows = sc.nextInt();
		sc.nextLine(); // ����ũ��
		
		int [][] charArray = new int[numRows][];
		// �� ����ŭ�� �ݺ��� ����
		for (int i = 0; i < numRows; i++) {
			// ���� ũ�⵵ �ޱ�
			System.out.print(i + "���� ũ�� �ޱ� : ");
			int numCols = sc.nextInt();
			
			charArray[i] = new int[numCols];
			
			int StartValue = i * numCols + 1;
			for (int j = 0; j <numCols; j++) {
				charArray[i][j] = StartValue++;
			}
		}
		// �迭 ���
		for (int k = 0; k <numRows; k++) {
			for (int j = 0; j < charArray[k].length; j++) {
				System.out.println((char)'a' + charArray[k][j]-1);
			}
			System.out.println();
		}
		sc.close();
	}
}
