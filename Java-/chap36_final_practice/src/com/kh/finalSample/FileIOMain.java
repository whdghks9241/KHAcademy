package com.kh.finalSample;

import java.io.FileWriter;

public class FileIOMain {

	public static void main(String[] args) {

		try {

			FileWriter fw;
			
			// true 2��° ������ ���� boolean true�����Ǹ� �ش� ���Ͽ� �̾�⸦ ����Ѵٴ� ��.
			fw = new FileWriter("file.txt", true);
			fw.write("������ �߰� �Ϸ�");
	
			fw.write("gagdas");
	
			fw.write(60);
			
			fw.close();
			
			System.out.println("�Ȱ�?");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
