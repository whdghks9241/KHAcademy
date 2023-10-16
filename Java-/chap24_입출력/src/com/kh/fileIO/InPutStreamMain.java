package com.kh.fileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class InPutStreamMain {
/*
 FileInputStream 
 	������ ���� �� ���Ǵ� Ŭ����
 	���Ϸκ��� �����͸� ����Ʈ ��Ʈ������ �о���� �� �����ϰ� ���
 	int read() : ���Ͽ��� ����  �����͸� �а� ��ȯ
 				�� �̻� ���� �����Ͱ� ������ -1�� ��ȯ
 	int read(byte[] b): ���Ͽ��� ����Ʈ �迭 'b'�� �����͸� �а� 
 						������ ���� ����Ʈ ���� ��ȯ
 	int read(byte[] b, int off, int len):���Ͽ��� ����Ʈ �迭 'b'�� 
 						�������� ��ġ���� �ִ� len ����Ʈ ��ŭ �о
 						������ ���� ����Ʈ ���� ��ȯ
 		void close() ���� �ݱ�
 	
 * */
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			//��δ� ���� �ۼ��ϰ� �ִ� ��Ŭ���� / ���� �̸� ����
			String fileName = "exam.txt";
			try {
				FileWriter w = new FileWriter(fileName);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			fis = new FileInputStream(fileName);
			
			int data; //���Ͽ��� �����͸� �о�鿩�� ���
			System.out.println("���� ����� ��ü���� ����");
			try {
				data = fis.read();
				System.out.println("���� �б� ����!");
			} catch (IOException e) {
				System.out.println("���� �б� ����!");
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}