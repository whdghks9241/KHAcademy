package com.kh.practice.exam;

import java.util.Arrays;
import java.util.Random;

public class Practice31 {

	private int[] lotto = new int[6];
	
	public int[] getLotto() {
		return lotto;
	}

	public void setLotto(int[] lotto) {
		this.lotto = lotto;
	}


	public void information() {
		
		Random rd = new Random();
		
		// array�� ���̸�ŭ �ݺ����� ������.
		for(int i = 0; i < lotto.length; i++) {
		
			// ���� ���� 1~45
			lotto[i] = rd.nextInt(45)+1;

			// �ߺ����� �ʰ� �����͸� �߰�
			// array�ȿ� �ߺ��� �����Ͱ� �ִ��� üũ
			for (int j = 0; j < i; j++) {

				if (lotto[i] == lotto[j]) {
					i--;
					break;
		
				}
			}
		}
		
		System.out.print(Arrays.toString(lotto));
		
	}
	
}
