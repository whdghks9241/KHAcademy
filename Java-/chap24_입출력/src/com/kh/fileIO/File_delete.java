package com.kh.fileIO;

import java.io.File;

public class File_delete {

	final static String path = "C:\\Users\\user1\\Desktop\\new_folder";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originFile = path + "\\cuteCat.png";
	
		// ���� ��ü ����
		File fileToDelete = new File(originFile);
		
	
		// ���ϻ���
		boolean delete = fileToDelete.delete();
		if (delete) {
			System.err.println("������ ���������� ���� �Ǿ����ϴ�.");
		} else {
			System.out.println("������ �����ϴµ� ���� �ϼ̽��ϴ�.");
		}
	}
}
