package com.kh.objExam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice4 {


	Date currentDate = new Date();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice4 p4 = new Practice4();
		p4.practice1();
		p4.practice2();
		p4.practice3();
		p4.practice4();
		p4.practice5();
		
	}
	
	public void practice1() {
		// ����� yyyy-MM-dd
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
		String forDate = sdf.format(currentDate);
		
		System.out.println(forDate);
	}
	
	public void practice2() {
		// �ú��� HH:mm:ss
		SimpleDateFormat sdf = new SimpleDateFormat("HH�� mm�� ss��");
		String forDate = sdf.format(currentDate);
		
		System.out.println(forDate);
	}
	
	public void practice3() {
		// ���� MM-dd
		SimpleDateFormat sdf = new SimpleDateFormat("MM�� dd��");
		String forDate = sdf.format(currentDate);
		
		System.out.println(forDate);
	}
	
	public void practice4() {
		// ����-�ð� yyyy-HH
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� HH��");
		String forDate = sdf.format(currentDate);
		
		System.out.println(forDate);
	}
	
	public void practice5() {
		// ��¥ - ���� yyyy-hh
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E����");
		String forDate = sdf.format(currentDate);
		
		System.out.println(forDate);
	}
}
