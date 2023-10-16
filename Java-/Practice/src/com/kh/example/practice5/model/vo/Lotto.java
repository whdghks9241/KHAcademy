package com.kh.example.practice5.model.vo;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
	/**
	 - lotto : int[]
		// �ʱ�ȭ �� ���, 
		�ߺ����� �ʴ� 1~45������
		������� 6�� �ʱ�ȭ
		+ Lotto()
		+ information() : void
	 */
	boolean numCheck = false;
	
	int[] arrayLotto = new int[6];

	Random rd = new Random();
	
	public Lotto() {

	}
	
	public void information() {
		
		// array�� ���̸�ŭ �ݺ����� ������.
		for(int i = 0; i < arrayLotto.length; i++) {
		
			// ���� ���� 1~45
			arrayLotto[i] = rd.nextInt(45)+1;

			// �ߺ����� �ʰ� �����͸� �߰�
			// array�ȿ� �ߺ��� �����Ͱ� �ִ��� üũ
			for (int j = 0; j < i; j++) {

				if (arrayLotto[i] == arrayLotto[j]) {
					i--;
					break;
		
				}
			}
		}
		
		System.out.print(Arrays.toString(arrayLotto));
		
	}
}
