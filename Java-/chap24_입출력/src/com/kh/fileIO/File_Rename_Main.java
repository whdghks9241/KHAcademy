package com.kh.fileIO;

import java.io.File;

public class File_Rename_Main {

	final static String path = "C:\\Users\\user1\\Desktop\\new_folder";

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String originFile = path + "\\cuteCat.png";
		String newFile = path + "\\Cat.png";
		
		File currentFile = new File(originFile);
		File renameFile = new File(newFile);
		
		// ���� �̸� �����ϱ�
		// ���� ������ �ִٸ�
		if (currentFile.renameTo(renameFile)) {
			System.out.println("���� �̸� ���� ����");
		} else {
			System.out.println("���� �̸� ���� ����");
		}
	}

}
