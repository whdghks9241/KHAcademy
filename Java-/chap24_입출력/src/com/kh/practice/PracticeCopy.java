package com.kh.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeCopy {

	final static String path = "C:\\Users\\user1\\Desktop";

	public static void main(String[] args) {

		PracticeCopy pc = new PracticeCopy();
		pc.PracticeCopy1();
		pc.PracticeCopy2();
	}
	
	public void PracticeCopy1 () {
		
		String inputFile = path + "\\Ccat.png";
		
		
		String outputFile = path + "\\Cat.png";
		
		try (FileInputStream fis = new FileInputStream(inputFile);
				FileOutputStream fos = new FileOutputStream(outputFile)) {
			
			byte[] buffer = new byte[1024];
			int byteRead;
			
			while ((byteRead = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, byteRead);
			}
			
			System.out.println("������ ���� �Ǿ����ϴ�.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void PracticeCopy2 () {

		// ����ȭ�鿡 ������ ���� 
		String folderPath = path + "\\new_folder";

		//���� �����
		File folder = new File(folderPath);
		folder.mkdir();
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("������ �����Ǿ����ϴ�.");
			
		} else {
			System.out.println("������ �̹� �����մϴ�.");
		}
		
		// �̹��� ���� jpg �Ǵ� png ������ ����ȭ�鿡 ������ ��
		String inputFile = path + "\\Ccat.png";

		// ���� �ȿ� ������ �̹��� �����ϱ�.
		String outputFile = folderPath + "\\cuteCat.png";

		try (FileInputStream fis = new FileInputStream(inputFile);
			FileOutputStream fos = new FileOutputStream(outputFile)) {
			
			byte[] buffer = new byte[1024];
			int byteRead;
			
			while ((byteRead = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, byteRead);
			}
			
			System.out.println("������ ���� �Ǿ����ϴ�");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
