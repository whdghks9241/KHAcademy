package com.kh.api.eaxm1;

import java.util.Date;
import java.text.SimpleDateFormat;

public class SimpledateFormatMain {
	/**
	 	SimpleDateFormat
	 	��¥�� �ð��� ���ϴ� �������� �������ϰų� ���ڿ��κ��� ��¥�� �ð��� �Ľ��ϴµ� ���Ǵ� Ŭ����
	 	
	 	yyyy-MM-dd HH:mm:ss
	 	y : ����
	 	M : ��
	 	d : ��
	 	h : 24�ð� ������ �ð�
	 	m : ��
	 	s : ��
	 */
	public static void main(String[] args) {
		
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		// �����õ� ���ڿ��� ��ȯ
		String forDate = sdf.format(currentDate);
		
		System.out.println(forDate);
		
	}
}
