package com.kh.practice;

import java.io.File;

public class Practice_mkdirs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Practice_mkdirs pm = new Practice_mkdirs();
		
		pm.Practice1();
	}
	
	public void Practice1() {
		// ���� �������� 2�� ����� C:\Users\ user1\Desktop\�̸�1\�̸�2
		// 1.������ ������ �ּҸ� ���Ѵ�
		String twoPath = "C:\\Users\\user1\\Desktop\\myNameis\\JongHwan";
		
		// 2. file ��ü ����
		File dir = new File(twoPath);
		
		// mkdirs �޼��带 ����ؼ� ���丮 �����õ�
		boolean success = dir.mkdirs();
		if (success) {
			System.out.println("���� ���� ����");
		} else {
			System.out.println("���� ���� ����");
		}

		// ���� �������� 3�� ����� C:\Users\ user1\Java_Workspace\chap25_
		// 1.������ ������ �ּҸ� ���Ѵ�
		String threePath = "C:\\Users\\user1\\Java_Workspace\\chap25_\\JongHwan";
		// 2. file ��ü ����
		dir = new File(threePath);
		
		// mkdirs �޼��带 ����ؼ� ���丮 �����õ�
		success = dir.mkdirs();
		if (success) {
			System.out.println("���� ���� ����");
		} else {
			System.out.println("���� ���� ����");
		}
		
		// ���� �������� 5�� ����� C:\Users\ user1\Document\myPlace\Music\Korean\kPop
		// 1.������ ������ �ּҸ� ���Ѵ�
		String fourPath = "C:\\Users\\user1\\Document\\myPlace\\Music\\Korean\\kPop";
		// 2. file ��ü ����
		dir = new File(fourPath);
		
		// mkdirs �޼��带 ����ؼ� ���丮 �����õ�
		success = dir.mkdirs();
		if (success) {
			System.out.println("���� ���� ����");
		} else {
			System.out.println("���� ���� ����");
		}
		
	}

}
