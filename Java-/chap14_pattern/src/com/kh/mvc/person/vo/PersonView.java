package com.kh.mvc.person.vo;

import java.util.Scanner;

public class PersonView {
	 
	String userName;
	
	boolean nameCheck = false;
	
	public String getUserInput() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������� �̸��� �Է��ϼ���");
		
		while(!nameCheck) {

			userName = sc.nextLine();
			
			if (userName == "" || userName == null) {

				System.out.println("������� �̸��� ���Դϴ�. �ٽ� �Է����ּ���");
				
			} else if (userName.length() < 2) {
				
				System.out.println("������� �̸��� �α��� �̻��̿��� �մϴ�. �ٽ� �Է����ּ���");

			} else {
				
				nameCheck = true;
			
			}
		}
		
		return userName;
	}
	
	// ����� �����ֱ�
	public void displayResult(String result) {
		System.out.println("������� �̸��� " + result + " �Դϴ�.");
	}
}
