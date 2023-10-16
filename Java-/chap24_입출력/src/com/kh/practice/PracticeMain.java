package com.kh.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeMain {

	final String path = "C:\\Users\\user1\\Desktop";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeMain pm = new PracticeMain();
//		pm.practice1();
		pm.practice2();
	}

	// ��� �����ؼ� ���� �����
	public void practice1() {
		
		try {
			FileWriter fw = new FileWriter(path +"//checkFile.txt");

			// ���Ͼ��� 
			fw.write("����������");
			// ���ϴݱ�
			fw.close();
			FileReader reader = new FileReader(path +"//checkFile.txt");
			BufferedReader bufferdReader = new BufferedReader(reader);
			
			String line;
			while ((line = bufferdReader.readLine()) != null) {
				System.out.println(line);
			}
			
			bufferdReader.close(); //������ �� ������ �ݾ��ֱ�.
			

			System.out.println("���� ���� �Ϸ�");
		} catch(IOException e) {
			e.printStackTrace();
			System.out.println("���� ���� ����");
		}
		
	}
	
	public void practice2() {

		String folderPath = path + "\\newfolder";

		//���� �����
		File folder = new File(folderPath);
		folder.mkdir();
		if (!folder.exists()) {
			System.out.println("���� ���� �Ϸ�");
		} else {
			System.out.println("������ ������");
		}
		try {
			FileWriter w = new FileWriter(folderPath + "//userInf8.txt");
			w.write("User ������ ��°��Դϴ�");
			w.write(" ����ȯ");
			w.close();
			System.out.println("���� ����� ������");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
}
