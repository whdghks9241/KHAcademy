package com.kh.fileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputFile = "C:\\Users\\user1\\Downloads\\cat.png";
		String outputFile = "C:\\Users\\user1\\Downloads\\cuteCat.jpg";
		/*
		 try(resource) �� try{} ������
		 try(resource) ������ �ڵ� �ڿ� ���� �������� �ڵ尡 ����� ���� ���� �� �ڿ��� �ڵ����� ���� �� ����
		 				����� File~~~Stream ���� �ڵ����� �ݰڴ� ������ ��
		 try{...}      ������ �ڿ��� �������� �ݾ� ����ó���� �����ؾ���
		 
		 try(FileInputStream fis = new FileInputStream(inputFile);
			FileOutputStream fos = new FileOutputStream(outputFile))
		 */
		try 
			(FileInputStream fis = new FileInputStream(inputFile);
			FileOutputStream fos = new FileOutputStream(outputFile)) {
			
			// 1024 ����Ʈ ũ���� ����
			byte[] buffer = new byte[1024];
			int byteRead;
			
			// int byteRead; fis.read(buffer) �޼��带 ȣ���Ͽ� ���۷� �о���� ����Ʈ ���� �����ϴ� ���� ����
			
			// ������ �а� �����ϴµ��� ���ȴ�.
			// fis.read(buffer) ���Ͽ��� �����͸� �о� ���̰�
			// 	fos.write(buffer, 0, byteRead); �о���� �����͸� ����Ѵ�.
			// ������ ���� �����ϸ� -1�� ��ȯ�ϸ鼭 while���� �����Ѵ�.
			while((byteRead = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, byteRead);
			}
			
			System.out.println("������ ���� �Ǿ����ϴ�");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
