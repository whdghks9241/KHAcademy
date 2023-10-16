package com.kh.fileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MakeFolderMain {
	final static String path = "C:\\Users\\user1\\Desktop";

	public static void main (String [] args) {
		
		// ������ ������ ��� ����
		// ���������� ���ϴ� ��� ����
		String folderPath = path + "\\new_folder";

		//���� �����
		File folder = new File(folderPath);
		folder.mkdir();
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("������ ���������� �����Ǿ����ϴ�.");
			
		} else {
			System.out.println("������ �̹� �����մϴ�.");
		}
		//folder.mkdir();
		
		try {
			FileWriter w = new FileWriter(folderPath + "//userInfo");
			w.write("User ������ ��°��Դϴ�");
			w.write(" ����ȯ");
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
