package com.kh.pattern.mvc.View;

public class StudentView {
	/*
	 *  정보를 화면에 출력
	 */
	public void displayInfo(String studentName, int studentAge) {
		
		System.out.println("학생 정보");
		System.out.println("이 름 : " + studentName);
		System.out.println("나 이 : " + studentAge);
		
	}
}
