package com.kh.ThreadMain;

public class StudentThread extends Thread{
	
	private String studentName;
	
	public StudentThread(String name) {
		this.studentName = name;
	}
	
	public void runt() {
		
		System.out.println(studentName + "��(��) ���θ� �����մϴ�.");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(studentName + "�� ���θ� ��Ĩ�ϴ�.");
	}

}
