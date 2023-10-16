package com.kh.finalSample.sjape.model.vo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileMain {

	public void fileSave(String fileName, Food food) {
		// ���޹��� fileName���� ���� ��ü ����
		try {
			FileOutputStream fOStream = new FileOutputStream(fileName);
			
			// ���� ��ü�� �����ϴ� ���� ��� ��Ʈ�� ����
			ObjectOutputStream objStream = new ObjectOutputStream(fOStream);
			
			// ���Ͽ� food��ü�� ���
			objStream.writeObject(food);
			
			// ��Ʈ������ ����
			objStream.close();
			fOStream.close();
			
			System.out.println("Food ��ü�� ���Ͽ� �����߽��ϴ�.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		FileMain FM = new FileMain();
		Food foodSample = new Food("��ȭ", 20);
		FM.fileSave("food.txt", foodSample);
		
	}
}
