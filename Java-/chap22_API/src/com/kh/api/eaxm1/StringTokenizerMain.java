package com.kh.api.eaxm1;

import java.util.StringTokenizer;

public class StringTokenizerMain {

	/**
		StringTokenizer Ŭ���� : ���ڿ��� �и��ϴµ� ���
								�־��� ������(�⺻ : ����)�� �⺻���� ���ڿ��� ��ū���� �и�
	 */
	public static void main(String[] args) {
		StringTokenizerMain STM = new StringTokenizerMain();
//		STM.STExam();
//		STM.STExam2();
//		STM.STExam3();
//		STM.STExam5();
//		STM.STExam6();
		STM.toMath();
	}
	
	
	public void STExam() {
		String text = "apple orange banana";
		StringTokenizer tokenizer = new StringTokenizer(text);
		
		// hasMoreTokens
		while(tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			System.out.println(token);
		}
	}
	
	public void STExam2() {
		
		String text = "apple,banana,grape,orange";
		StringTokenizer tokenizer = new StringTokenizer(text, ",");
		
		while(tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			System.out.println(token);
		}
	}
	
	public void STExam3() {
		/**
		 - �����ڸ� ����ؼ� text ����� - �����ڷ� ��� �����
		 */
		String text = "apple-banana-grape-orange";
		StringTokenizer tokenizer = new StringTokenizer(text, "-");
		
		while(tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			System.out.println(token);
		}
	}
	
	public void STExam5() {
		// Ư�� �ܾ� �����ϰ� �����ڷ� �и�
		String text = "This is a test. But not a real one.";
		StringTokenizer tokenizer = new StringTokenizer(text, " .");
		while(tokenizer.hasMoreTokens()) {
			String word = tokenizer.nextToken();
			if (!word.equals("test")) {
				System.out.println(word);
			}
		}
	}
	
	public void STExam6() {
		//��¥ �����ڷ� �и�
		String date = "2023-09-13";
		StringTokenizer tokenizer = new StringTokenizer(date, "-");
		int year = Integer.parseInt(tokenizer.nextToken());
		int month = Integer.parseInt(tokenizer.nextToken());
		int day = Integer.parseInt(tokenizer.nextToken());
		System.out.println("year : " + year);
		System.out.println("month : " + month);
		System.out.println("day : " + day);
	}
	
	public void toMath() {
		
		String text = "The price is $155.99";
		StringTokenizer tokenizer = new StringTokenizer(text, " $.");
		
		while(tokenizer.hasMoreElements()) {
			String token = tokenizer.nextToken();
			if (token.matches("\\d+(\\.\\d+)?")) {
				System.out.println("Number : " + token);
			}
		}
		
	}
}
